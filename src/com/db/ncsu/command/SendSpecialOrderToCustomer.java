package com.db.ncsu.command;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.db.database.DatabaseManager;
import com.db.ncsu.Main;

public class SendSpecialOrderToCustomer extends Command {

	
	static SimpleDateFormat format =
            new SimpleDateFormat("MM/dd/yy");
	
	
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("Special Order Id","Int","Special Order Id",true);	
		args[1] = new CommandArgument("Merchandise Id","Int","Merchandise Id",true);		
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {

		String specialOrderLookup = "select customerid,storeid,so.id,merchandiseid,quantity,price,status "+ 
		"from SpecialOrder so, SpecialOrderItems soi "+ 
		"where so.id = soi.specialorderid "+ 
		"and so.id=? and merchandiseid=? and status in ('ordered','open')";
		ResultSet rs = DatabaseManager.runQuery(specialOrderLookup, args);
		
		
		int customerId = 0;
		int storeId = 0;
		int merchandiseId = 0;
		int quantity =0;
		float price=0;
		int soId=0;
		try {
			if (rs.next())
			{
				customerId = rs.getInt("customerid");
				storeId = rs.getInt("storeid");
				merchandiseId = rs.getInt("merchandiseid");
				quantity = rs.getInt("quantity");
				price = rs.getFloat("price");
				soId = rs.getInt("id");

			}
			else
			{
				System.out.println("Could not find open special order and merchandise");
				return;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		//Check for Billing Cycle
		String checkBillingCycleSQL = "SELECT id " +
				"FROM CustomerBillingCycle " +
				"WHERE Status = 'open' AND SYSDATE >= startDate AND SYSDATE <= endDate AND customerID = "+customerId;
		int billingCycleNum = DatabaseManager.getSeqVal(checkBillingCycleSQL);
		if (billingCycleNum == -1)
		{			
			String makeBillingSQL = "INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) " +
					"VALUES(customerbillcycle_seq.nextval, ?, ?, ?,'open')";
			CommandArgument billargs[] = new CommandArgument[3];
			
			billargs[0] = new CommandArgument("CustomerId","Int","CustomerId",false);	
			billargs[0].setValue(customerId);
			
			billargs[1] = new CommandArgument("StartDate","Date","StartDate",false);
			Date d = new Date();
			billargs[1].setValue(format.format(d));			
			
			billargs[2] = new CommandArgument("EndDate","Date","EndDate",false);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			c.add(Calendar.MONTH, 1);
			d = c.getTime();
			billargs[2].setValue(format.format(d));
						
			DatabaseManager.runInsert(makeBillingSQL,billargs);
			System.out.println("Created New Billing Cycle For Customer");
		    
			billingCycleNum = DatabaseManager.getSeqVal(checkBillingCycleSQL);			
		}
		
		
		
		//Get Next Sequence
		String seqSQL="select customerbill_seq.nextval from CustomerAccount";		
		int seqNum = DatabaseManager.getSeqVal(seqSQL);

		
		//Make a list of PreparedStatements to Run
		
		ArrayList<PreparedStatement> preparedStatements = new ArrayList<PreparedStatement>();
		
		//Insert Top Level Special Order
		String CustomerBillSQL="Insert into CustomerBill(dateTime,staffID,id, storeID, customerBillCycleID) VALUES (?,"+Main.userId+","+seqNum+","+storeId+","+billingCycleNum+")";
	
		CommandArgument argsAdustjusted[] = new CommandArgument[1];
		argsAdustjusted[0] = new CommandArgument("Today","Date","Today",false);							
		Date d = new Date();
		argsAdustjusted[0].setValue(format.format(d));
		argsAdustjusted[0].setType("Date");			
	
		preparedStatements.add(DatabaseManager.makePreparedStatement(CustomerBillSQL,argsAdustjusted));
		
		
		String CustomerBillItemSQL="Insert into CustomerBillItems(customerBillID, merchandiseID, quantity, price) VALUES ("+seqNum+","+merchandiseId+","+quantity+","+price+")";		
		CommandArgument noargs[] = new CommandArgument[0];
		preparedStatements.add(DatabaseManager.makePreparedStatement(CustomerBillItemSQL,noargs));			
	
		
		String updateSOSQL = "UPDATE SpecialOrderItems SET status = 'sent' WHERE specialOrderID = "+soId+" AND MerchandiseID = "+merchandiseId;
		preparedStatements.add(DatabaseManager.makePreparedStatement(updateSOSQL,noargs));			
		
		
		//Run Transaction		
		DatabaseManager.runTransaction(preparedStatements);
		System.out.println("Order Sent to Customer, Customer Bill Created for Order!!!!");	
	}

	@Override
	public String getCommandName() {
		return "Send Special Order to Customer";
	}
	
	
	

	
}


package com.db.ncsu.command;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.db.database.DatabaseManager;
import com.db.ncsu.Main;

public class InsertCustomerBill extends Command {

	
	static SimpleDateFormat format =
            new SimpleDateFormat("MM/dd/yy");
	
	
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[4];
		args[0] = new CommandArgument("Today","Date","Today",false);		
		args[1] = new CommandArgument("StoreID","Int","StoreID",false);
		args[2] = new CommandArgument("StaffID","Int","StaffID",false);
		args[3] = new CommandArgument("CustomerId","Int","CustomerId",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		
		//Check for Billing Cycle
		String checkBillingCycleSQL = "SELECT id " +
				"FROM CustomerBillingCycle " +
				"WHERE Status = 'open' AND SYSDATE >= startDate AND SYSDATE <= endDate AND customerID = "+args[3].getValue();
		int billingCycleNum = DatabaseManager.getSeqVal(checkBillingCycleSQL);
		if (billingCycleNum == -1)
		{			
			String makeBillingSQL = "INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) " +
					"VALUES(customerbillcycle_seq.nextval, ?, ?, ?,'open')";
			CommandArgument billargs[] = new CommandArgument[3];
			
			billargs[0] = new CommandArgument("CustomerId","Int","CustomerId",false);	
			billargs[0].setValue(args[3].getValue());
			
			billargs[1] = new CommandArgument("StartDate","Date","StartDate",false);
			Date d = new Date();
			billargs[1].setValue(format.format(d));			
			
			billargs[2] = new CommandArgument("EndDate","Date","EndDate",false);
			if (d.getMonth() == 11)
				d.setMonth(0);
			else
				d.setMonth(d.getMonth()+1);
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
		String CustomerBillSQL="Insert into CustomerBill(id, dateTime, storeID, staffID, customerBillCycleID) VALUES ("+seqNum+",?,?,?,"+billingCycleNum+")";
	
		CommandArgument argsAdustjusted[] = new CommandArgument[3];
		argsAdustjusted[0] = new CommandArgument("Today","Date","Today",false);		
		argsAdustjusted[1] = new CommandArgument("StoreID","Int","StoreID",false);
		argsAdustjusted[2] = new CommandArgument("StaffID","Int","StaffID",false);
		for (int i =0; i <3; i++)
		{
			argsAdustjusted[i].setValue(args[i].getValue());
			argsAdustjusted[i].setType(args[i].getType());			
		}
		preparedStatements.add(DatabaseManager.makePreparedStatement(CustomerBillSQL,argsAdustjusted));
		
		
		
		//Insert Each Order
		String CustomerBillItemSQL="Insert into CustomerBillItems(customerBillID, merchandiseID, quantity, price) VALUES ("+seqNum+",?,?,?)";		

		CommandArgument specialargs[] = new CommandArgument[3];
		specialargs[0] = new CommandArgument("merchandiseID","Int","Merchandise ID", true);		
		specialargs[1] = new CommandArgument("quantity","Int","Quantity", true);
		specialargs[2] = new CommandArgument("price", "Float", "Price", true);
	
		String moreItems = "Y";
		Scanner scanner = new Scanner(System.in);
		int i=1;
		while (moreItems.equals("Y"))
		{
			System.out.println("Entering Details of Item "+i);
			for (CommandArgument arg : specialargs)
			{
				System.out.println(arg.getDescription());
				String argString = scanner.nextLine();
				arg.setValue(argString);
			}
			preparedStatements.add(DatabaseManager.makePreparedStatement(CustomerBillItemSQL,specialargs));			
			
			String updateSQL = "update StoreItem set Quantity=Quantity - "+ specialargs[1].getValue()+" where storeID = "+Main.userStoreId+" AND merchandiseID ="+specialargs[0].getValue();
			CommandArgument noargs[] = new CommandArgument[0];
			preparedStatements.add(DatabaseManager.makePreparedStatement(updateSQL,noargs));			
						
			
			System.out.println("Enter more Items? Y for Yes");
			moreItems = scanner.nextLine();
			i++;
		}
		//scanner.close();

		//Run Transaction
		DatabaseManager.runTransaction(preparedStatements);
		System.out.println("Customer Bill Added!!!");	
	}

	@Override
	public String getCommandName() {
		return "Add a New Customer Bill";
	}
	
	
	

	
}


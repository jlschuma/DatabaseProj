package com.db.ncsu.command;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.db.database.DatabaseManager;

public class InsertCustomerPayment extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[4];
		args[0] = new CommandArgument("customerBillCycleID","Int","Customer Billing Cycle ID",true);		
		args[1] = new CommandArgument("StaffID","Int","StaffID",false);
		args[2] = new CommandArgument("Today","Date","Today",false);
		args[3] = new CommandArgument("paymentInformation","String","Payment Information",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {		
		
		ArrayList<PreparedStatement> preparedStatements = new ArrayList<PreparedStatement>();
		
		String CustomerPaymentSQL="Insert into CustomerPayment(customerBillCycleID, staffID, paidDate, paymentInformation, confirmationCode) VALUES (?,?,?,?,customer_confirmation_seq.nextval)";
		preparedStatements.add(DatabaseManager.makePreparedStatement(CustomerPaymentSQL,args));

		//Select cbc.id AS BillingCycleId,cbc.customerid,sum(quantity*price) AS Total,cbc.status
		String sqlUpdate = "Update CustomerBillingCycle set status='paid' where id="+args[0].getValue();
		CommandArgument emptyargs[] = new CommandArgument[0];
		preparedStatements.add(DatabaseManager.makePreparedStatement(sqlUpdate,emptyargs));			
		
		//Run Transaction
		DatabaseManager.runTransaction(preparedStatements);
		System.out.println("Customer Payment made!!!");


	}

	@Override
	public String getCommandName() {
		return "Insert a Customer Payment";
	}
	
	
	

	
}

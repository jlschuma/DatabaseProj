package com.db.ncsu.command;

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
		String sql = "INSERT INTO CustomerPayment(customerBillCycleID, staffID, paidDate, paymentInformation, confirmationCode) VALUES(?, ?, ?, ?, customer_confirmation_seq.nextval)";
		DatabaseManager.runPreparedStatement(sql,args,false);
		
	}

	@Override
	public String getCommandName() {
		return "Insert a Customer Payment";
	}
	
	
	

	
}

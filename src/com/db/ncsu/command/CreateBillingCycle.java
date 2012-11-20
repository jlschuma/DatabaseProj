package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class CreateBillingCycle extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[3];
		args[0] = new CommandArgument("Customer ID","Int","Customer ID",true);		
		args[1] = new CommandArgument("Today","Date","Today",false);		
		args[2] = new CommandArgument("MonthLater","Date","MonthLater",false);		

		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		String sql = "INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) " +
				"VALUES(customerbillcycle_seq.nextval, ?, ?, ?,'open')";
		DatabaseManager.runPreparedStatement(sql,args,false);
		System.out.println("Billing Cycle Created!!!");	
	}

	@Override
	public String getCommandName() {
		return "Create Customer Billing Cycle";
	}
	
}


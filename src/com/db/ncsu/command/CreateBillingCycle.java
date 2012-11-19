package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class CreateBillingCycle extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Customer ID","Int","Customer ID",true);		
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		String sql = "INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) " +
				"VALUES(customerbillcycle_seq.nextval, ?, to_date(SYSDATE, 'yyyy/mm/dd hh24:mi:ss'), " +
				"ADD_MONTHS(to_date(SYSDATE, 'yyyy/mm/dd hh24:mi:ss'), 1),'open')";
		DatabaseManager.runPreparedStatement(sql,args,false);
		System.out.println("Billing Cycle Created!!!");	
	}

	@Override
	public String getCommandName() {
		return "Create Customer Billing Cycle";
	}
	
}


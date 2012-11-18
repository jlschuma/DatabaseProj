package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class UpdateCustomerBillingCycle extends Command {
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Customer Bill ID","Int","Customer Bill ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		CommandArgument selectArgs[] = new CommandArgument[3];
		selectArgs[0] = new CommandArgument("Status","String","Status",true);	
		selectArgs[1] = new CommandArgument("Start Date", "Date", "Start Date (MM/DD/YY)", true);
		selectArgs[2] = new CommandArgument("End Date", "Date", "End Date (MM/DD/YY)", true);
		
		String selectSQL = "select status, startdate, enddate from CustomerBillingCycle where ID=?";
		if (!DatabaseManager.checkUpdate(selectSQL,args,selectArgs))
		{			
			System.out.println("No Rows found, Make sure "+args[0].getName()+"="+args[0].getValue()+" exists!");
			return;
		}

		String updateSQL = "UPDATE CustomerBillingCycle SET status = ?, startdate = ?, enddate = ? WHERE id = ?";
		getParamValues(selectArgs);
		DatabaseManager.executeUpdate(updateSQL,args,selectArgs);				
		System.out.println("Customer Billing Cycle Updated!");	
	}

	@Override
	public String getCommandName() {
		return "Update Customer Billing Cycle";
	}
}
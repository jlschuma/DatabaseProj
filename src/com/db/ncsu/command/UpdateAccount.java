package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class UpdateAccount extends Command {
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("CustomerID","Int","Customer ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		CommandArgument selectArgs[] = new CommandArgument[6];
		selectArgs[0] = new CommandArgument("SSN","String","Social Security Number",true);		
		selectArgs[1] = new CommandArgument("Name","String","Name of Customer",true);
		selectArgs[2] = new CommandArgument("Number","Date","Date of Birth in format MM/DD/YY",true);
		selectArgs[3] = new CommandArgument("Gender","String","Gender",true);
		selectArgs[4] = new CommandArgument("Phone Number","String","Phone Number",true);
		selectArgs[5] = new CommandArgument("Address","String","Address",true);
		
		String selectSQL = "select SSN,Name,DOB,Gender,PhoneNumber,Address from CustomerAccount where ID=?";
		if (!DatabaseManager.checkUpdate(selectSQL,args,selectArgs))
		{			
			System.out.println("No Rows found, Make sure "+args[0].getName()+"="+args[0].getValue()+" exists!");
			return;
		}

		String updateSQL = "update CustomerAccount set SSN=?,Name=?,DOB=?,Gender=?,PhoneNumber=?,Address=? where ID=?";
		getParamValues(selectArgs);
		DatabaseManager.executeUpdate(updateSQL,args,selectArgs);				
		System.out.println("Customer Updated!");	
	}

	@Override
	public String getCommandName() {
		return "Update Customer Account Information";
	}
}

package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowEmployeesByStore extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("StaffID","Int","StaffID",false);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//Select * from Staff
		String sql = "Select * from Staff where storeId = ? order by StoreId, Department";
		DatabaseManager.runPreparedStatement(sql,args,true);
			
	}

	@Override
	public String getCommandName() {
		return "Show All Employees For My Store";
	}
	
}

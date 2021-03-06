package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowEmployees extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[0];
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//Select * from Staff
		String sql = "Select * from Staff order by StoreId, Department";
		DatabaseManager.runPreparedStatement(sql,args,true);
			
	}

	@Override
	public String getCommandName() {
		return "Show All Employees";
	}
	
}

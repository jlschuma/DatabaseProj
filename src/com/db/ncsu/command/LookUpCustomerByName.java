package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class LookUpCustomerByName extends Command {
	
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Name","String","Customer Name",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//Select * from Store
		String sql = "Select * from CustomerAccount c where c.name like ?";
		DatabaseManager.runPreparedStatement(sql,args,true);
			
	}

	@Override
	public String getCommandName() {
		return "Look Up Customer By Name";
	}
	
	}


package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class CheckItemAtStore extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("Store ID", "Int", "Store ID", true);
		args[1] = new CommandArgument("Merchandise","Int","Merchandise ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, merchandiseID, quantity, price
		//FROM Store s, StoreItem si  
		//WHERE s.id = si.storeID AND si.merchandiseID =1;
		String sql = "SELECT storeID, merchandiseID, name, quantity, price " +
				"FROM Store s, StoreItem si, Merchandise m " +
				"WHERE s.id = ? AND s.id = si.storeID AND si.merchandiseID = m.id AND si.merchandiseID = ?";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Check for an Item at a Store";
	}
}

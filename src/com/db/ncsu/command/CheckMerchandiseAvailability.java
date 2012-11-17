package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class CheckMerchandiseAvailability extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Merchandise","Int","Merchandise ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, merchandiseID, quantity, price
		//FROM Store s, StoreItem si
		//WHERE s.id = si.storeID AND si.merchandiseID =1
		String sql = "SELECT storeID, merchandiseID, quantity, price " +
				"FROM Store s, StoreItem si " +
				"WHERE s.id = si.storeID AND si.merchandiseID = ?";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Check Merchandise Availability (across all stores)";
	}
}
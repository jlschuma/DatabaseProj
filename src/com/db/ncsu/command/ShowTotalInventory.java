package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowTotalInventory extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[0];
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT merchandiseID, sum(quantity)
		//FROM Store s, StoreItem  si  
		//WHERE s.id = si.storeID
		//GROUP BY merchandiseID
		String sql = "SELECT merchandiseID, m.name, storeID, sum(quantity) AS Quantity " +
				"FROM Store s, StoreItem  si, Merchandise m " +
				"WHERE s.id = si.storeID AND si.merchandiseID = m.id " +
				"GROUP BY merchandiseID, storeID, m.name";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Show inventory of all stores summed";
	}
}

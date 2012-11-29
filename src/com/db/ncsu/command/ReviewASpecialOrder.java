package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ReviewASpecialOrder extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Special Order ID","Int","Special Order ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, status, specialOrderID, merchandiseID, quantity, price
		//FROM SpecialOrder o, SpecialOrderItems oi
		//WHERE o.id = oi.specialOrderID AND o.id = 1
		String sql = "SELECT storeID, status, specialOrderID, merchandiseID, m.name, quantity, price " +
				"FROM SpecialOrder o, SpecialOrderItems oi, Merchandise m " +
				"WHERE o.id = oi.specialOrderID AND oi.merchandiseID = m.id AND o.id = ?";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Review Customer Special Order";
	}
}
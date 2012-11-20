package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ViewAllSpecialOrdersByType extends Command {
	
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Status","String","Status",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, status, specialOrderID, merchandiseID, quantity, price
		//FROM SpecialOrder o, SpecialOrderItems oi
		//WHERE o.id = oi.specialOrderID AND customerID = 3
		String sql = "SELECT storeID, specialOrderID, SUM(quantity * price) AS Balance " +
				"FROM SpecialOrder o, SpecialOrderItems oi " +
				"WHERE o.id = oi.specialOrderID AND status = ?" +
				"GROUP BY storeID, specialOrderID";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "View Special Orders By Type";
	}

}

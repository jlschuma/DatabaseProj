package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ViewAllSpecialOrdersByType extends Command {
	
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Status","String","Status (open, ordered, sent)",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, status, specialOrderID, merchandiseID, quantity, price
		//FROM SpecialOrder o, SpecialOrderItems oi
		//WHERE o.id = oi.specialOrderID AND customerID = 3
		String sql = "SELECT storeID,specialOrderId, quantity,merchandiseID,m.name,oi.price,vendorID,status " +
				"FROM SpecialOrder o, SpecialOrderItems oi, Merchandise m " +
				"WHERE o.id = oi.specialOrderID AND status = ? and oi.merchandiseID = m.id " +
				"Order by merchandiseID,StoreId";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "View Special Orders By Status";
	}

}

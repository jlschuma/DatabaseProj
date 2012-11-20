package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ViewAllCustomerSpecialOrdersByType extends Command {
	
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("Customer ID","Int","Customer ID",true);
		args[1] = new CommandArgument("Status","String","Status",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, status, specialOrderID, merchandiseID, quantity, price
		//FROM SpecialOrder o, SpecialOrderItems oi
		//WHERE o.id = oi.specialOrderID AND customerID = 3
		String sql = "SELECT storeID, specialOrderID, SUM(quantity * price) AS Balance " +
				"FROM SpecialOrder o, SpecialOrderItems oi " +
				"WHERE o.id = oi.specialOrderID AND customerID = ? AND status = ?" +
				"GROUP BY storeID, specialOrderID";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "View Customer Special Orders By Type";
	}

}

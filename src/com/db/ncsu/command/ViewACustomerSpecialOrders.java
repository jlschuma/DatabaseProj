package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ViewACustomerSpecialOrders extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Customer ID","Int","Customer ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, status, specialOrderID, merchandiseID, quantity, price
		//FROM SpecialOrder o, SpecialOrderItems oi
		//WHERE o.id = oi.specialOrderID AND customerID = 3
		String sql = "select id,datetime,storeid,staffid,merchandiseid,quantity,status from SpecialOrder so, SpecialOrderItems soi "+
		"where so.id = soi.specialorderid "+
		"and customerId=? ";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "View A Customer's Special Orders";
	}
}

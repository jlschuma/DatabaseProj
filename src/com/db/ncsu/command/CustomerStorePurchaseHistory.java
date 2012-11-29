package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class CustomerStorePurchaseHistory extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[3];
		args[0] = new CommandArgument("Customer ID","Int","Customer ID",true);
		args[1] = new CommandArgument("To Date","Date","To Date (MM/DD/YY)",true);
		args[2] = new CommandArgument("From Date","Date","From Date (MM/DD/YY)",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT cb.customerID, sum(quantity * price)
		//FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi
		//WHERE b.id = bi.customerBillID AND cb.id = b.id AND cb.customerID = 1 AND dateTime > 01-JAN-03 AND dateTime < 01-JAN-04
		//GROUP BY customerID
		String sql = "SELECT cb.customerID, merchandiseID, m.name, price, SUM(quantity) AS Quantity " +
				"FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi, Merchandise m " +
				"WHERE b.id = bi.customerBillID AND cb.id = b.id AND cb.customerID = ? AND bi.merchandiseID = m.id AND dateTime > ? AND dateTime < ? " +
				"GROUP BY cb.customerID, merchandiseID, m.name, price";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Show total purchases from a customer for the store for a time period";
	}
}
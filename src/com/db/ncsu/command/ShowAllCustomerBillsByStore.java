package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowAllCustomerBillsByStore extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("Start Date", "Date", "Start Date (MM/DD/YYYY)", true);
		args[1] = new CommandArgument("End Date", "Date", "End Date (MM/DD/YYYY)", true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, sum(price * quantity) AS totalBill
		//FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi
		//WHERE b.id = bi.customerBillID AND cb.id = b.id AND cb.customerID = 1 AND dateTime > Ô01-JAN-03Õ AND dateTime < Ô01-JAN-04Õ AND status = ÔbilledÕ
		//GROUP BY storeID
		
		
		String sql = "SELECT storeId, status, sum(price * quantity) AS TotalBalance " +
				"FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi "+
				"WHERE cb.id = b.customerBillcycleid  AND b.id = bi.customerbillid AND DateTime > ? AND DateTime < ? " +
				"GROUP BY storeId,Status ";

		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Show All Customer Bills By Store";
	}
}

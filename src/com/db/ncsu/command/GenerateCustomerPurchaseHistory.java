package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class GenerateCustomerPurchaseHistory extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Customer ID","Int","Customer ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, status, customerBillID, merchandiseID, quantity, price, dateTime
		//FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi
		//WHERE b.id = bi.customerbillId and cb.id = b.id AND cb.customerID = 1
		String sql = "SELECT storeID, merchandiseID, m.name, quantity, price, dateTime " +
				"FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi, Merchandise m " +
				"WHERE b.id = bi.customerbillId and cb.id = b.id AND m.id = bi.merchandiseID AND cb.customerID = ?";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Generate Customer Purchase History";
	}
}
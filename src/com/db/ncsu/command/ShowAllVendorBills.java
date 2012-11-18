package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowAllVendorBills extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[0];
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT vendorID, sum(price * quantity), storeID
		//FROM VendorBill, VendorBillItems
		//WHERE vendorBillID = id AND dateTime > Ô01-JAN-03Õ AND dateTime < Ô01-JAN-04Õ
		//GROUP BY vendorID,storeID
		String sql = "SELECT vendorBillID, vendorID, v.name, storeID, status, sum(price * quantity) AS Balance " +
				"FROM VendorBill vb, VendorBillItems vi, Vendor v " +
				"WHERE vi.vendorBillID = vb.id AND vb.vendorID = v.id " +
				"GROUP BY vendorBillID, vendorID, v.name, storeID, status";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Show all vendor bills";
	}
}

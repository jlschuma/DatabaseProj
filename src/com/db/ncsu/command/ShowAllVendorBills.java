package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowAllVendorBills extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[3];
		args[0] = new CommandArgument("StoreID","Int","StoreID",false);
		args[1] = new CommandArgument("Start Date", "Date", "Start Date (MM/DD/YYYY)", true);
		args[2] = new CommandArgument("End Date", "Date", "End Date (MM/DD/YYYY)", true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT vendorID, sum(price * quantity), storeID
		//FROM VendorBill, VendorBillItems
		//WHERE vendorBillID = id AND dateTime > �01-JAN-03� AND dateTime < �01-JAN-04�
		//GROUP BY vendorID,storeID
		String sql = "SELECT vendorID, v.name, sum(price * quantity) AS TotalBalance " +
				"FROM VendorBill vb, VendorBillItems vi, Vendor v " +
				"WHERE vi.vendorBillID = vb.id AND vb.vendorID = v.id and StoreId = ? AND DateTime > ? AND DateTime < ? " +
				"GROUP BY vendorID, v.name";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Show All Vendor Bills Grouped By Vendor";
	}
}

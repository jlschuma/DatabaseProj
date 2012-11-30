package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowAllVendorBillsByStores extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("Start Date", "Date", "Start Date (MM/DD/YYYY)", true);
		args[1] = new CommandArgument("End Date", "Date", "End Date (MM/DD/YYYY)", true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT vendorID, sum(price * quantity), storeID
		//FROM VendorBill, VendorBillItems
		//WHERE vendorBillID = id AND dateTime > 01-JAN-03 AND dateTime < 01-JAN-04
		//GROUP BY vendorID,storeID
		
		String sql = "SELECT  vendorID, v.name, storeID, status, sum(price * quantity) AS TotalBalance " +
				"FROM VendorBill vb, VendorBillItems vi, Vendor v " +
				"WHERE vi.vendorBillID = vb.id AND vb.vendorID = v.id AND DateTime > ? AND DateTime < ? " +
				"GROUP BY vendorID, v.name, storeID, status order by storeId,vendorId";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Show All Vendor Bills By Store";
	}
}

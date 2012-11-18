package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class GenerateVendorPurchaseHistory extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Vendor ID","Int","Vendor ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, status, vendorBillID, merchandiseID, quantity, price
		//FROM VendorBill v, VendorBillItems vi
		//WHERE v.id = vi.vendorBillID AND vendorID = 3
		String sql = "SELECT storeID, merchandiseID, name, quantity, price, dateTime " +
				"FROM VendorBill v, VendorBillItems vi, Merchandise m " +
				"WHERE v.id = vi.vendorBillID AND vi.merchandiseID = m.id AND v.vendorID = ?";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Generate Vendor Purchase History";
	}
}
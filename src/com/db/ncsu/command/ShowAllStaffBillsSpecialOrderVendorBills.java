package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowAllStaffBillsSpecialOrderVendorBills extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[3];
		args[0] = new CommandArgument("StaffId","Int","StaffId",true);
		args[1] = new CommandArgument("Start Date", "Date", "Start Date (MM/DD/YYYY)", true);
		args[2] = new CommandArgument("End Date", "Date", "End Date (MM/DD/YYYY)", true);
		return args;
	}

	
	
	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, sum(price * quantity) AS totalBill
		//FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi
		//WHERE b.id = bi.customerBillID AND cb.id = b.id AND cb.customerID = 1 AND dateTime > Ô01-JAN-03Õ AND dateTime < Ô01-JAN-04Õ AND status = ÔbilledÕ
		//GROUP BY storeID
		System.out.println("Customer Bills");
		String sql = "SELECT customerID, datetime,status, merchandiseId,price,quantity " +
				"FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi " +
				"WHERE cb.id = b.customerBillcycleid  AND b.id = bi.customerbillid and StaffId = ?  AND dateTime > ? AND dateTime < ? ";
		DatabaseManager.runPreparedStatement(sql,args,true);

		System.out.println("Special Orders");
		String sqlso = "SELECT id, datetime,status, merchandiseId,price,quantity " +
				"FROM SpecialOrder b, SpecialOrderItems bi " +
				"WHERE b.id = bi.specialOrderid and StaffId = ?  AND dateTime > ? AND dateTime < ? ";
		DatabaseManager.runPreparedStatement(sqlso,args,true);

		
		System.out.println("Vendor Bills");
		String sqlvb = "SELECT vendorID,  datetime,status, merchandiseId,price,quantity " +
				"FROM VendorBill b, VendorBillItems bi " +
				"WHERE b.id = bi.vendorbillid and StaffId = ?  AND dateTime > ? AND dateTime < ? ";
		DatabaseManager.runPreparedStatement(sqlvb,args,true);

		System.out.println("Customer Payments");
		String sqlcp = "select customerid,customerbillcycleid, paiddate,paymentinformation,confirmationcode from CustomerPayment cp, CustomerBillingCycle cb "+
		"where cp.customerbillcycleid = cb.id and StaffId = ?  AND paiddate > ? AND paiddate < ? ";
		DatabaseManager.runPreparedStatement(sqlcp,args,true);
		
		
		
	}

	@Override
	public String getCommandName() {
		return "Show All Customer Bills, Vendor Bills, Payments, and Special Orders Done By a Staff Member";
	}
}

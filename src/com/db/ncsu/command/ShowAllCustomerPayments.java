package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowAllCustomerPayments extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("customerID","Int","Customer ID",true);

		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//SELECT storeID, sum(price * quantity) AS totalBill
		//FROM CustomerBillingCycle cb, CustomerBill b, CustomerBillItems bi
		//WHERE b.id = bi.customerBillID AND cb.id = b.id AND cb.customerID = 1 AND dateTime > Ô01-JAN-03Õ AND dateTime < Ô01-JAN-04Õ AND status = ÔbilledÕ
		//GROUP BY storeID
		String sql = "SELECT customerBillCycleID, staffID, paidDate, paymentInformation, confirmationCode " +
				"FROM CustomerPayment cp, CustomerBillingCycle cbc " +
				"WHERE customerID = ? "+
				"AND cp.customerBillCycleID = cbc.id";
		DatabaseManager.runPreparedStatement(sql,args,true);
		
	}

	@Override
	public String getCommandName() {
		return "Show all customer payments for a Given Customer";
	}
}

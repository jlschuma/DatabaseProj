package com.db.ncsu.command;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.database.DatabaseManager;

public class InsertVendorBill extends Command{
	
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[5];
		args[0] = new CommandArgument("StoreID","Int","StoreID",false);
		args[1] = new CommandArgument("StaffID","Int","StaffID",false);
		args[2] = new CommandArgument("VendorID","Int","Vendor ID",true);
		args[3] = new CommandArgument("Payment Information","String","Payment Information",true);
		args[4] = new CommandArgument("Confirmation Code","String","Confirmation Code",true);

		return args;
	}
	@Override
	public void run(CommandArgument[] args) {

		//Get Next Sequence
				String seqSQL="select VendorBill_seq.nextval from CustomerAccount";		
				int seqNum = DatabaseManager.getSeqVal(seqSQL);
		
		//Make a list of PreparedStatements to Run
		
		ArrayList<PreparedStatement> preparedStatements = new ArrayList<PreparedStatement>();
		
		//Insert Top Level Special Order
		String VendorBillSQL="Insert into VendorBill(id, dateTime, storeID, staffID, vendorID, paymentInformation, confirmationCode) VALUES ("+seqNum+",to_date(SYSDATE, 'yyyy/mm/dd hh24:mi:ss'),?,?,?,?,?)";
		preparedStatements.add(DatabaseManager.makePreparedStatement(VendorBillSQL,args));
		
		//Insert Each Order
		String VendorBillItemSQL="Insert into VendorBillItems(vendorbillID, merchandiseID, quantity, price, status) VALUES ("+seqNum+",?,?,?,'open')";		

		CommandArgument specialargs[] = new CommandArgument[3];
		specialargs[0] = new CommandArgument("merchandiseID","Int","merchandiseID",false);		
		specialargs[1] = new CommandArgument("quantity","Int","quantity",false);
		specialargs[2] = new CommandArgument("price","Float","price",false);

		String moreItems = "Y";
		Scanner scanner = new Scanner(System.in);
		int i=1;
		while (moreItems.equals("Y"))
		{
			System.out.println("Entering Details of Item "+i);
			for (CommandArgument arg : specialargs)
			{
				System.out.println(arg.getDescription());
				String argString = scanner.nextLine();
				arg.setValue(argString);
			}
			preparedStatements.add(DatabaseManager.makePreparedStatement(VendorBillItemSQL,specialargs));			
			System.out.println("Enter more Items? Y for Yes");
			moreItems = scanner.nextLine();
			i++;
		}

		//Run Transaction
		DatabaseManager.runTransaction(preparedStatements);
		System.out.println("Bought from Vendor!!!");	
	}

	@Override
	public String getCommandName() {
		return "Buy From Vendor";
	}
	
	

}

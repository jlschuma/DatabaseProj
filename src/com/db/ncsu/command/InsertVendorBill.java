package com.db.ncsu.command;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.database.DatabaseManager;

public class InsertVendorBill extends Command{
	
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[4];
		args[1] = new CommandArgument("StoreID","Int","StoreID",false);
		args[2] = new CommandArgument("StaffID","Int","StaffID",false);
		args[3] = new CommandArgument("CustomerID","Int","Customer ID",true);
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
		String VendorBillSQL="Insert into VendorBill(id, dateTime, storeID, staffID, vendorID, status) VALUES ("+seqNum+",to_date(SYSDATE, 'yyyy/mm/dd hh24:mi:ss'),?,?,?,'open')";
		preparedStatements.add(DatabaseManager.makePreparedStatement(VendorBillSQL,args));
		
		//Insert Each Order
		String VendorBillItemSQL="Insert into VendorBillItems(vendorbillID, merchandiseID, quantity, price) VALUES ("+seqNum+",?,?,1)";		

		CommandArgument specialargs[] = new CommandArgument[2];
		specialargs[0] = new CommandArgument("merchandiseID","Int","merchandiseID",false);		
		specialargs[1] = new CommandArgument("quantity","Int","quantity",false);
	
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
			//preparedStatements.add(DatabaseManager.makePreparedStatement(SpecialOrderItemSQL,specialargs));			
			System.out.println("Enter more Items? Y for Yes");
			moreItems = scanner.nextLine();
			i++;
		}
		scanner.close();

		//Run Transaction
		DatabaseManager.runTransaction(preparedStatements);
		System.out.println("Special order Added!!!");	
	}

	@Override
	public String getCommandName() {
		return "Add a Special Order";
	}
	
	

}

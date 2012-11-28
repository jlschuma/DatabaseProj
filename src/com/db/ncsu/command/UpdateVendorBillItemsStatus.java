package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class UpdateVendorBillItemsStatus extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("Vendor Bill Item ID","Int","Vendor Bill Item ID",true);
		args[1] = new CommandArgument("Merchandise ID","Int","Merchandise ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		CommandArgument selectArgs[] = new CommandArgument[1];
		selectArgs[0] = new CommandArgument("Status","String","Status (open or recieved)",true);	
		
		String selectSQL = "select status from VendorBillItems where vendorbillid = ? AND merchandiseid = ?";
		if (!DatabaseManager.checkUpdate(selectSQL,args,selectArgs))
		{			
			System.out.println("No Rows found, Make sure "+args[0].getName()+"="+args[0].getValue()+" exists!");
			return;
		}

		String updateSQL = "UPDATE VendorBillItems SET status = ? WHERE vendorbillid = ? AND merchandiseid = ?";
		getParamValues(selectArgs);
		DatabaseManager.executeUpdate(updateSQL,args,selectArgs);				
		System.out.println("Vendor Bill Item Status Updated!");	
	}

	@Override
	public String getCommandName() {
		return "Update Vendor Bill Item Status";
	}
	
}

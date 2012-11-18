package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class UpdateVendor extends Command {
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Vendor ID","Int","Vendor ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		CommandArgument selectArgs[] = new CommandArgument[3];
		selectArgs[0] = new CommandArgument("Name","String","Name",true);	
		selectArgs[1] = new CommandArgument("Phone Number", "String", "Phone Number", true);
		selectArgs[2] = new CommandArgument("Address", "String", "Address", true);
		
		String selectSQL = "select name, phoneNumber, address from Vendor where ID=?";
		if (!DatabaseManager.checkUpdate(selectSQL,args,selectArgs))
		{			
			System.out.println("No Rows found, Make sure "+args[0].getName()+"="+args[0].getValue()+" exists!");
			return;
		}

		String updateSQL = "UPDATE Vendor SET name = ?, phoneNumber = ?, address = ? WHERE id = ?";
		getParamValues(selectArgs);
		DatabaseManager.executeUpdate(updateSQL,args,selectArgs);				
		System.out.println("Vendor Updated!");	
	}

	@Override
	public String getCommandName() {
		return "Update Vendor";
	}
}
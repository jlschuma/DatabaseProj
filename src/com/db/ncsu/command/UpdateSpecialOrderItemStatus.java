package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class UpdateSpecialOrderItemStatus extends Command {
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("Special Order ID","Int","Special Order ID",true);
		args[1] = new CommandArgument("Merchandise ID","Int","Merchandise ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		CommandArgument selectArgs[] = new CommandArgument[1];
		selectArgs[0] = new CommandArgument("Status","String","Status",true);	
		
		String selectSQL = "select status from SpecialOrderItems where specialOrderID = ? AND MerchandiseID = ?";
		if (!DatabaseManager.checkUpdate(selectSQL,args,selectArgs))
		{			
			System.out.println("No Rows found, Make sure "+args[0].getName()+"="+args[0].getValue()+" exists!");
			return;
		}

		String updateSQL = "UPDATE SpecialOrderItems SET status = ? WHERE specialOrderID = ? AND MerchandiseID = ?";
		getParamValues(selectArgs);
		DatabaseManager.executeUpdate(updateSQL,args,selectArgs);				
		System.out.println("Special Order Item Status Updated!");	
	}

	@Override
	public String getCommandName() {
		return "Update Special Order Item Status";
	}
}
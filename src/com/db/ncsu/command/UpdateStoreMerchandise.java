package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class UpdateStoreMerchandise extends Command {
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[2];
		args[0] = new CommandArgument("StoreID","Int","Store ID",true);
		args[1] = new CommandArgument("MercahndiseID","Int","Merchandise ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		CommandArgument selectArgs[] = new CommandArgument[2];
		selectArgs[0] = new CommandArgument("Quantity","Int","Quantity",true);		
		selectArgs[1] = new CommandArgument("Price","Float","Price",true);
		
		String selectSQL = "select Quantity, Price from StoreItem where storeID = ? AND merchandiseID = ?";
		if (!DatabaseManager.checkUpdate(selectSQL,args,selectArgs))
		{			
			System.out.println("No Rows found, Make sure "+args[0].getName()+"="+args[0].getValue()+" with "+args[1].getName()+"="+args[1].getValue() +" exists!");
			return;
		}

		String updateSQL = "update StoreItem set Quantity=?,Price=? where storeID = ? AND merchandiseID = ?";
		getParamValues(selectArgs);
		DatabaseManager.executeUpdate(updateSQL,args,selectArgs);				
		System.out.println("Store Item Updated!");	
	}

	@Override
	public String getCommandName() {
		return "Update Store Merchandise";
	}
}

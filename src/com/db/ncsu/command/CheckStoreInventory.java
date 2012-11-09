package com.db.ncsu.command;

public class CheckStoreInventory extends Command {
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Merchandise","String","Merchandise Name",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		System.out.println("THIS LINE WOULD CHECK INVENTORY");
		
	}

	@Override
	public String getCommandName() {
		return "Check Store Inventory";
	}
}

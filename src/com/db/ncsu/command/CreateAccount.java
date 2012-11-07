package com.db.ncsu.command;

public class CreateAccount extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[3];
		args[0] = new CommandArgument("Name","String","Name of Employee");
		args[1] = new CommandArgument("Number","String","Phone Number");
		args[2] = new CommandArgument("Address","String","Customer Address");
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		validate(args);
			
	}

	@Override
	public String getCommandName() {
		return "Create a new Account";
	}
	
	
	

	
}

package com.db.ncsu.command;

public class CreateEmployee extends Command {
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[3];
		args[0] = new CommandArgument("Name","String","Name of Employee",true);
		args[1] = new CommandArgument("Number","String","Phone Number",true);
		args[2] = new CommandArgument("Address","String","Customer Address",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		System.out.println("THIS LINE WOULD CREATE AN EMPLOYEE FORM THE ARGS");
		
	}

	@Override
	public String getCommandName() {
		return "Create a new Employee";
	}
	
}

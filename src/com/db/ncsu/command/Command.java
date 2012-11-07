package com.db.ncsu.command;

public abstract class Command {

	public abstract CommandArgument[] getArguments();
	
	public  void execute(CommandArgument[] args){
		if (!validate(args)){
			//handle bad args
		}
		run(args);
	}
	
	public  abstract void run(CommandArgument[] args);

	
	
	protected boolean validate(CommandArgument[] args)
	{
		//test they are type of
		return true;
	}

	public abstract String getCommandName();
	
	
}

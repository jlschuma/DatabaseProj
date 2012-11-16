package com.db.ncsu.command;

import java.util.Scanner;

public abstract class Command {

	public abstract CommandArgument[] getArguments();
	
	public  void execute(CommandArgument[] args){
		//GET CALLED EVERYTIME 		
		if (!validate(args)){
			//handle bad args
			System.out.println("Please try again.");
			return;
		}
		run(args);
	}
	
	
	protected void getParamValues(CommandArgument[] selectArgs)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press enter to keep current values, enter a new value to change");
		for (CommandArgument arg : selectArgs)
		{
			System.out.println(arg.getDescription()+ " Current Value is "+arg.getValue());
			String argString = scanner.nextLine();
			if (argString.length() > 0)
				arg.setValue(argString);		
		}		
	}
	
	
	protected boolean validate(CommandArgument[] args)
	{
		//test they are type of
		for(CommandArgument arg : args){
			if(!arg.validate())
				return false;
		}
		return true;
	}

	public abstract String getCommandName();
	public  abstract void run(CommandArgument[] args);
	
	
}

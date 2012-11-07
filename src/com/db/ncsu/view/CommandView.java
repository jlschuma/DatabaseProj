package com.db.ncsu.view;

import com.db.ncsu.command.Command;
import com.db.ncsu.command.CommandArgument;

public class CommandView {

	public void showCommand(Command command)
	{
		CommandArgument[] args = command.getArguments();
		for (CommandArgument arg : args)
		{
			System.out.println(arg.getName());
			//read inpud
			arg.setValue("BA");
			//System.in.re
		}
		
		command.execute(args);
	}
	
}

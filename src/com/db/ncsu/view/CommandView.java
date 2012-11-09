package com.db.ncsu.view;

import java.util.Scanner;

import com.db.ncsu.command.Command;
import com.db.ncsu.command.CommandArgument;

public class CommandView {

	public void enterParametersAndExeute(Command command)
	{
		Scanner scanner = new Scanner(System.in);
		CommandArgument[] args = command.getArguments();
		for (CommandArgument arg : args)
		{
			System.out.println(arg.getDescription());
			String argString = scanner.nextLine();
			arg.setValue(argString);
		}		
		command.execute(args);
	}
	
}

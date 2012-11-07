package com.db.ncsu;

import com.db.ncsu.command.Command;
import com.db.ncsu.user.User;
import com.db.ncsu.view.CommandView;

public class Main {

	public static void main(String args[])
	{
		//prentend we picked A sales
		User user = new User();
		Command[] userCommands = user.getSalesCommands();
		CommandView commandView = new CommandView();
		commandView.showCommand(menu(userCommands));				
		//wait for input (number)		
	}

	
	public static Command menu(Command[] commands)
	{
		for (Command command : commands)
		{
			//print it out
		}
		return commands[0];		
	}
	
}

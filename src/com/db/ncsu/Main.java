package com.db.ncsu;

import java.util.Scanner;

import com.db.ncsu.command.Command;
import com.db.ncsu.user.User;
import com.db.ncsu.view.CommandView;

public class Main {

	
	public static String userId;
	public static String userStoreId;
	
	public static void main(String args[])
	{
		System.out.println("Enter your username");

		String userId = "1";
		String storeId = "2";
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		// Functions Lookup the type of user - Present a sales user		
		User user = new User();
		
		while (true)
		{
			System.out.println("Enter a command");
		
			// Look user up and give correct screen
			///user.billingCommands() or stocking etc..

			Command[] userCommands = user.getSalesCommands();  
			int i = 1;
			for (Command command : userCommands)
			{
				System.out.println(i + " "+ command.getCommandName());
				i++;
			}
			int choosenCommand = scanner.nextInt();
			Command commandToExecute = userCommands[choosenCommand-1];		
			CommandView commandView = new CommandView();
			commandView.enterParametersAndExeute(commandToExecute);				
		
		}
	}

	
}

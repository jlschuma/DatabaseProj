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

	    userId = "1";
	    userStoreId = "2";
		
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
			String chosenCommand = scanner.nextLine();
			int choosenCommand = -1;
			try{
				choosenCommand = Integer.parseInt(chosenCommand);
			} catch (NumberFormatException e) {
				System.out.println("Incorrect input. Please enter the number of an option.");
				continue;
			}
			if(choosenCommand <= userCommands.length && choosenCommand > 0){
				Command commandToExecute = userCommands[choosenCommand-1];
				CommandView commandView = new CommandView();
				commandView.enterParametersAndExeute(commandToExecute);
			}
			else{
				System.out.println("Option number does not exist. Please try again.");
			}
		
		}
	}

	
}

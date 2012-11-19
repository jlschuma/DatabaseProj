package com.db.ncsu;

import java.util.Scanner;

import com.db.database.DatabaseManager;
import com.db.ncsu.command.Command;
import com.db.ncsu.user.User;
import com.db.ncsu.view.CommandView;

public class Main {

	
	public static int userId = 1;
	public static int userStoreId = 1;
	
	public static void main(String args[])
	{
		System.out.println("Enter your Id");

		
	    
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
	    
		
		// Functions Lookup the type of user - Present a sales user		
		User user = new User();
	
		
		String department = "Franchise";
		//Look up id, set userId, setstoreId, bring back department
		//String department = DatabaseManager.lookUpUser(id);
		//public static int userId = 1;
		//public static int userStoreId = 1
				
		Command[] userCommands = null;
		
		if (department.equals("Franchise"))
		{
			userCommands = user.getFranchiseCommands();  
		}
		
		while (true)
		{
			System.out.println("**** "+department + " Commands ****");
			System.out.println("Enter a command");
		
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

package com.db.ncsu.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.db.ncsu.Main;
import com.db.ncsu.command.Command;
import com.db.ncsu.command.CommandArgument;

public class CommandView {

	static SimpleDateFormat format =
            new SimpleDateFormat("MM/dd/yy");
	
	public void enterParametersAndExeute(Command command)
	{
		Scanner scanner = new Scanner(System.in);
		CommandArgument[] args = command.getArguments();
		for (CommandArgument arg : args)
		{
			if (arg.isPromptUser())
			{
				System.out.println(arg.getDescription());
				String argString = scanner.nextLine();
				arg.setValue(argString);
			}
			else if (arg.getName().equals("StaffID"))
			{
				arg.setValue(Main.userId);
			}
			else if (arg.getName().equals("StoreID"))
			{
				arg.setValue(Main.userStoreId);
			}
			else if (arg.getName().equals("Today"))
			{
				Date d = new Date();
				arg.setValue(format.format(d));
			}

		}		
		command.execute(args);
	}
	
	
}

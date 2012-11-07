package com.db.ncsu.user;

import com.db.ncsu.command.Command;
import com.db.ncsu.command.CreateAccount;

public  class User {

	private Command[] salesCommands;

	public User()
	{
		salesCommands = new Command[]{ new CreateAccount()};
	}
	
	public Command[] getSalesCommands() {
		return salesCommands;
	}
	
	
	
}

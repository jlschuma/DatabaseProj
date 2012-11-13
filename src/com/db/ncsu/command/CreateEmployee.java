package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class CreateEmployee extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[9];
		args[0] = new CommandArgument("StoreID","Int","Store Id",true);
		args[1] = new CommandArgument("Salary","Int","Salary",true);
		args[2] = new CommandArgument("phoneNumber","String","Phone Number",true);
		args[3] = new CommandArgument("name","String","Name",true);
		args[4] = new CommandArgument("age","Int","Age",true);
		args[5] = new CommandArgument("gender","String","Gender",true);
		args[6] = new CommandArgument("title","String","Title",true);
		args[7] = new CommandArgument("deparment","String","Department",true);
		args[8] = new CommandArgument("address","String","Address",true);		
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//INSERT INTO Staff(id, storeId, salary, phoneNumber, name, age, gender, title, department, address)
		String sql = "INSERT INTO Staff(id, storeId, salary, phoneNumber, name, age, gender, title, department, address) VALUES(staff_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		DatabaseManager.runPreparedStatement(sql,args,false);
			
	}

	@Override
	public String getCommandName() {
		return "Create a new Employee";
	}
	
}

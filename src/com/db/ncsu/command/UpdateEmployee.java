package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class UpdateEmployee extends Command {
	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("Employee ID","Int","Employee ID",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		CommandArgument selectArgs[] = new CommandArgument[9];
		selectArgs[0] = new CommandArgument("Store ID","Int","Store ID",true);
		selectArgs[1] = new CommandArgument("Salary","Int","Salary",true);
		selectArgs[2] = new CommandArgument("Phone Number","String","Phone Number",true);
		selectArgs[3] = new CommandArgument("Name","String","Name",true);
		selectArgs[4] = new CommandArgument("Age","Int","Age",true);
		selectArgs[5] = new CommandArgument("Gender","String","Gender",true);
		selectArgs[6] = new CommandArgument("Title","String","Title",true);
		selectArgs[7] = new CommandArgument("Department","String","Department",true);
		selectArgs[8] = new CommandArgument("Address","String","Address",true);
		
		String selectSQL = "select storeID, salary, phoneNumber, name, age, gender, title, " +
				"department, address from Staff where ID=?";
		if (!DatabaseManager.checkUpdate(selectSQL,args,selectArgs))
		{			
			System.out.println("No Rows found, Make sure "+args[0].getName()+"="+args[0].getValue()+" exists!");
			return;
		}

		String updateSQL = "UPDATE Staff SET storeID = ?, Salary = ?, phoneNumber = ?, name = ?, age = ?," +
				" gender = ?, title = ?, department = ?, address = ? WHERE id = ?";
		getParamValues(selectArgs);
		DatabaseManager.executeUpdate(updateSQL,args,selectArgs);				
		System.out.println("Employee Updated!");	
	}

	@Override
	public String getCommandName() {
		return "Update Employee";
	}
}
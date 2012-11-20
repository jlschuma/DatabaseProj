package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class CreateAccount extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[6];
		args[0] = new CommandArgument("SSN","String","Social Security Number",true);		
		args[1] = new CommandArgument("Name","String","Name of Customer",true);
		args[2] = new CommandArgument("Number","Date","Date of Birth in format MM/DD/YY",true);
		args[3] = new CommandArgument("Gender","String","Gender",true);
		args[4] = new CommandArgument("Phone Number","String","Phone Number",true);
		args[5] = new CommandArgument("Address","String","Address",true);
		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//Get Next Sequence
		String seqSQL="select customeraccount_seq.nextval from CustomerAccount";		
		int seqNum = DatabaseManager.getSeqVal(seqSQL);

		
		//INSERT INTO CustomerAccount(id, ssn, name, dob, gender, phoneNumber, address)
		//VALUES (customeraccount_seq.nextval, '123-34-2222', 'Mike', NULL, 'M', '333-333-3333', '101 Way');
		String sql = "INSERT INTO CustomerAccount(id, ssn, name, dob, gender, phoneNumber, address) VALUES("+seqNum+", ?, ?, ?, ?, ?, ?)";
		DatabaseManager.runPreparedStatement(sql,args,false);

		System.out.println("Added Customer Account "+seqNum);
		
	}

	@Override
	public String getCommandName() {
		return "Create a new Account";
	}
	
	
	

	
}

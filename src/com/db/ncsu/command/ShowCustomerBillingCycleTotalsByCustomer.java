package com.db.ncsu.command;

import com.db.database.DatabaseManager;

public class ShowCustomerBillingCycleTotalsByCustomer extends Command {

	@Override
	public CommandArgument[] getArguments() {
		CommandArgument args[] = new CommandArgument[1];
		args[0] = new CommandArgument("CustomerId","Int","CustomerId",true);

		return args;
	}

	@Override
	public void run(CommandArgument[] args) {
		//Select * from Staff
		String sql = "Select cbc.id AS BillingCycleId,cbc.customerid,startdate,enddate,sum(quantity*price) AS Total,cbc.status "+
                     "from CustomerBill cb, "+ 
                      "CustomerBillItems cbi, "+
                      "CustomerBillingCycle cbc, "+ 
                     "CustomerAccount ca "+
                     "where cb.id = cbi.customerbillid "+ 
                     "and cbc.id = cb.customerbillcycleid "+
                     "and ca.id = cbc.customerid            "+        
                     "and customerid = ? "+
                     "group by cbc.id,cbc.customerid,cbc.status,startdate,enddate order by enddate";
		
		DatabaseManager.runPreparedStatement(sql,args,true);
			
	}

	@Override
	public String getCommandName() {
		return "Show Billing Cycles By Customer";
	}
	
}

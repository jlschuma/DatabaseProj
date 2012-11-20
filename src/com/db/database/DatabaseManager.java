package com.db.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.db.ncsu.Main;
import com.db.ncsu.command.CommandArgument;

public class DatabaseManager {
	private static final String jdbcURL = "jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:orcl";


	// Put your oracle ID and password here
	private static final String user = "jlschuma";
	private static final String password = "test123";

	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet result = null;


	private static DatabaseManager dm = new DatabaseManager();
	static SimpleDateFormat format =
            new SimpleDateFormat("MM/dd/yy");

	private DatabaseManager()
	{
		initialize();	
	}

	private static PreparedStatement setPreparedStatementArgument(PreparedStatement stat, CommandArgument arg, int spot) throws NumberFormatException, SQLException	
	{	
		    if (arg.getType().equals("Int"))
			{

				stat.setInt(spot, Integer.parseInt(arg.getValue().toString()));
				//sql = sql.replaceFirst(Pattern.quote("?"), arg.getValue().toString());
			}
			else if (arg.getType().equals("String"))
			{
				if (arg.getValue() == null)
				{
					stat.setString(spot, null);
				}
				else
				{
					stat.setString(spot, arg.getValue().toString());
				}
				///sql = sql.replaceFirst(Pattern.quote("?"), "'"+arg.getValue().toString()+"'");
			}
			else if (arg.getType().equals("Float"))
			{
				stat.setFloat(spot, Float.parseFloat(arg.getValue().toString()));
			}
			else if (arg.getType().equals("Date"))
			{
				if (arg.getValue() == null)
				{
					stat.setDate(spot, null);
				}
				else 
				{
					java.util.Date d = null;
					try {
						d = format.parse(arg.getValue().toString());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					java.sql.Date d2 = new java.sql.Date(d.getTime());
					stat.setDate(spot, d2);
					///sql = sql.replaceFirst(Pattern.quote("?"), "'"+arg.getValue().toString()+"'");
				}
			}

			else System.out.println("UNKNOWN TYPE");
		return stat;
	}


	public static boolean checkUpdate(String sql, CommandArgument[] args, CommandArgument[] selectArgs)
	{
		PreparedStatement stat = null;
		try {
			stat = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			for (int i =0; i < args.length; i++)
				stat = setPreparedStatementArgument(stat,args[i],i+1);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				

		int count = 0;
		try {
			ResultSet re = stat.executeQuery();
			ResultSetMetaData meta = re.getMetaData();
		    int cols = meta.getColumnCount();

		    // and finally, we dump the result set
		    while(re.next())
		    {
		        for (int i=0; i < cols; i++) {
		        	if (selectArgs[i].getType().equals("Date"))
		        	{
		        		if (re.getDate(i+1) == null)
		        		{
		        			//Don't set a value
		        		}
		        		else
		        		{
		        			java.util.Date newDate = new Date(re.getDate(i+1).getTime());
		        			selectArgs[i].setValue(format.format(newDate));
		        		}
		        	}
		        	else
		        	{
		        		selectArgs[i].setValue(re.getString(i+1));
		        	}
		        }
		        count++;
		    }


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if (count == 1)
		{	
			return true;

		}
		return false;
	}

	public static int getSeqVal(String sql)
	{
		try {
			PreparedStatement stat = connection.prepareStatement(sql);
			ResultSet re = stat.executeQuery();
			if (re.next())
			{
				return re.getInt(1);
			}
			else
			{
				return -1;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;
	}
	
	public static int runInsert(String sql,CommandArgument[] args)
	{
		PreparedStatement stat = null;
		try {
			stat = connection.prepareStatement(sql);
			int i=1;
			for (CommandArgument arg : args)
			{
				stat = setPreparedStatementArgument(stat,arg,i);
				i++;
			}
			return stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
		
	}


	public static boolean executeUpdate(String sql, CommandArgument[] args, CommandArgument[] selectArgs)
	{
		PreparedStatement stat = null;
		try {
			stat = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {


		int i=0;
		for (; i < selectArgs.length; i++)
		{
			stat = setPreparedStatementArgument(stat,selectArgs[i],i+1);			
		}
		for (int i2 =0; i2 < args.length; i2++)
		{
			stat = setPreparedStatementArgument(stat,args[i2],i+1);			
			i++;
		}


		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				

		int count = 0;
		try {
			count = stat.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		if (count == 1)
			return true;
		return false;
	}


	public static boolean runTransaction(ArrayList<PreparedStatement> preparedStatements)
	{
		//turn autocommit off
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		//run all queries
		for(PreparedStatement preparedStatement : preparedStatements)
		{
			try {
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		//set back to true state
		try {
			connection.commit();
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static PreparedStatement makePreparedStatement(String sql, CommandArgument[] args)
	{
		PreparedStatement stat = null;
		try {
			stat = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int i=1;
		for (CommandArgument arg : args)
		{
			try {
				stat = setPreparedStatementArgument(stat,arg,i);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		return stat;
	}


	public static String lookUpUser(String id)
	{
		try {
			PreparedStatement stat =  connection.prepareStatement("Select department,storeId from Staff where id = ?");
			int intid = Integer.parseInt(id);
			stat.setInt(1, intid);
			ResultSet re = stat.executeQuery();
			Main.userId = intid;
			if (re.next())
			{				
				Main.userStoreId = re.getInt("storeId");
				return re.getString("department");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}

	public static boolean runPreparedStatement(String sql, CommandArgument[] args, boolean isSelect)
	{		
		boolean result = false;
		try {

			PreparedStatement stat =  connection.prepareStatement(sql);

			int i=1;
			for (CommandArgument arg : args)
			{
				stat = setPreparedStatementArgument(stat,arg,i);
				i++;
			}

			if (!isSelect)
			{
				stat.executeUpdate();
				result = true;
			}
			else
			{
				ResultSet re = stat.executeQuery();
				ResultSetMetaData meta = re.getMetaData();
			    int cols = meta.getColumnCount();

			    // we dump the column information about the result set
		        System.out.print("Row Number\t");
			    for (i=1; i <= cols; i++)
			    {
			        System.out.print(meta.getColumnName(i)+ "\t");
			    }

			    // and finally, we dump the result set
			    int cnt = 1;			   
			    while(re.next())
			    {
			        System.out.print("\n"+cnt+"\t\t");
			        for (i=1; i <= cols; i++) {
			            System.out.print(re.getString(i)+"\t");
			        }
			        cnt++;
			    }
			    System.out.println();
			    result = true;

			}
			stat.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}






	private static void initialize() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(jdbcURL, user, password);
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}



	private static void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (result != null) {
			try {
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
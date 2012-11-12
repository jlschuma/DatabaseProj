package com.db.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;

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
	
	private DatabaseManager()
	{
		initialize();	
	}
	
	
	
	public static boolean runInsertPreparedStatement(String sql, CommandArgument[] args)
	{		
		try {
			Statement stat =  connection.createStatement();
			
			//.prepareStatement(sql);
			for (CommandArgument arg : args)
			{
				if (arg.getType().equals("Int"))
				{
					sql = sql.replaceFirst(Pattern.quote("?"), arg.getValue().toString());
				}
				else if (arg.getType().equals("String"))
				{
					sql = sql.replaceFirst(Pattern.quote("?"), "'"+arg.getValue().toString()+"'");
				}
				
				else System.out.println("UNKNOWN TYPE");
			}
			System.out.println(sql);			
			return stat.execute(sql);
						
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	private static void initialize() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(jdbcURL, user, password);
			statement = connection.createStatement();

			//	statement.executeUpdate("DROP TABLE Cats");
			//statement
			//		.executeUpdate("INSERT INTO Cats VALUES ('Oscar', 'Egyptian Mau',"

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

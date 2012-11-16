package com.db.ncsu.command;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CommandArgument {

	private String name;
	private String type;
	private String description;
	private Object value;
	private boolean promptUser;
	
	public CommandArgument(String name, String type, String description, boolean promptUser)
	{
		this.name = name;
		this.type = type;
		this.description = description;
		this.setPromptUser(promptUser);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}

	public boolean isPromptUser() {
		return promptUser;
	}

	public void setPromptUser(boolean promptUser) {
		this.promptUser = promptUser;
	}
	
	public boolean validate(){
		if (this.getType().equals("Int"))
		{
			try{
				Integer.parseInt(this.value.toString());
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for parameter" + this.name);
				System.out.println("Integer expected.");
				return false;
			}
			return true;
		}
		else if (this.getType().equals("String"))
		{
			// Don't do anything, anything that can be typed into the console is a string.
			return true;
		}
		else if (this.getType().equals("Float"))
		{
			try{
				Float.parseFloat(this.value.toString());
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for parameter" + this.name);
				System.out.println("Decimal number expected.");
				return false;
			}
			return true;
		}
		else if (this.getType().equals("Date"))
		{
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
	 
			try {
	 
				//If not valid, it will throw a ParseException.
				format.parse(this.getValue().toString());
	 
			} catch (ParseException e) {
	 
				System.out.println("Incorrect format for parameter" + this.name);
				System.out.println("Date in the format MM/dd/yy expected.");
				return false;
			}
			return true;
		}
		
		else System.out.println("UNKNOWN TYPE");
		return false;
	}
	
	
}

package com.db.ncsu.command;

public class CommandArgument {

	private String name;
	private String type;
	private String description;
	private Object value;
	
	public CommandArgument(String name, String type, String description)
	{
		this.name = name;
		this.type = type;
		this.description = description;
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
	
	
}

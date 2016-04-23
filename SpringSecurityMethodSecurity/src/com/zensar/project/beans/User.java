package com.zensar.project.beans;
public class User {
	private int id;
	private String firstName,lastName;
	private String type;
	public User() {}
	
	public User(int id, String firstName, String lastName, String type) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

package edu.mum.cs.entity;

public class User {
	private String name;
	private String password;
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
}

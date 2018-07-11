package com.Proxy;

public class Administrator implements IRole {

	String name, password;
	
	public Administrator(String name, String password) {
		this.name = name;
		this.password = password;
		// TODO Auto-generated constructor stub
	}

	public void executeCommand(String command) {
		System.out.println("SUCCESS: executed command");
	}

}

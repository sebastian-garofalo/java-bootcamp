package com.Proxy;

public class UserProxy implements IRole {
	
	Administrator admin = null;
	
	public UserProxy(String name, String password) {
		admin = new Administrator(name, password);
	}
	
	public void executeCommand(String command) {
		System.out.print("ERROR: This command can't be execute - You aren't admin");
	}
	

}

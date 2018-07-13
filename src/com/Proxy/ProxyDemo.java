package com.Proxy;

public class ProxyDemo {
	
	public static void main(String[] args) {
		
		Administrator admin = new Administrator("Admin", "1234");
		admin.executeCommand("Command");
		
		UserProxy user = new UserProxy("User", "1234");
		user.executeCommand("Command");
	}

}

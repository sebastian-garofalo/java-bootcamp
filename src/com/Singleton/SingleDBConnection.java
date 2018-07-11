package com.Singleton;

public class SingleDBConnection {
	
	private static SingleDBConnection connection = null;
	private String userName = "";
	private String password = "";
	private String url = "";
	
	private SingleDBConnection() {
		
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getURL() {
		return url;
	}
	
	public void setURL(String url) {
		this.url = url;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void connect(String userName, String password) {
		System.out.println("Connection established to the DataBase");
	}
	
	public static SingleDBConnection getDBConnection() {
		if(connection == null) {
			connection = new SingleDBConnection();
		}
		return connection;
	}
	public static void main(String args[]) {
		
	}
}



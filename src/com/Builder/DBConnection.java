package com.Builder;

public class DBConnection {
	
	private String user;
	private String password;
	private String url;
	
	public DBConnection(String user, String pass, String url) {
		this.user = user;
		password = pass;
		this.url = url;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
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
	private boolean connect(String user, String password) {
		return true;
	}
	public void connect() {
		if(this.connect(user, password))
			System.out.println("Connection established to the DataBase");
	}
	
}

package com.Builder;

public class DBConnectionBuilder {
	
	private String user;
	private String password;
	private String url;

	public DBConnectionBuilder setUser(String user) {
		this.user = user;
		return this;
	}
	
	public DBConnectionBuilder setPassword(String password) {
		this.password = password;
		return this;
	}
	
	public DBConnectionBuilder setUrl(String url) {
		this.url = url;
		return this;
	}
	
	public DBConnection getConnection() {
		return new DBConnection(user, password, url);
	}
	
	public static void main(String[] args) {
		DBConnectionBuilder dbbuild = new DBConnectionBuilder();
		DBConnection dbcon = dbbuild.setUser("admin").setPassword("1234").setUrl("jdbc:postgresql://127.0.0.1:5432/postgres").getConnection();
		dbcon.connect();
	}
}
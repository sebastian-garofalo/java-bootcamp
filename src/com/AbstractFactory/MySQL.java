package com.AbstractFactory;

public class MySQL extends AbstractSQLDB{
	
	public void connect() {
		System.out.println("Connected to the MySQL database");
	}

}

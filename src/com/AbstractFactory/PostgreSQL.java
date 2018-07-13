package com.AbstractFactory;

public class PostgreSQL extends AbstractSQLDB{
	
	public void connect() {
		System.out.println("Connected to the PostgreSQL database");
	}
}

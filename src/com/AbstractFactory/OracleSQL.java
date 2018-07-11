package com.AbstractFactory;

public class OracleSQL extends AbstractSQLDB{
	
	public void connect() {
		System.out.println("Connected to the OracleSQL database");
	}
}

package com.AbstractFactory;

public class SQLServer extends AbstractSQLDB{

	public void connect() {
		System.out.println("Connected to the SQLServer database");
	}
}

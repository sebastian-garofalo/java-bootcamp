package com.AbstractFactory;

public abstract class SQLFactory {
	
	public abstract AbstractSQLDB getDB(String db);
	
}

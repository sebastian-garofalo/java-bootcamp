package com.AbstractFactory;

public class OLEDB extends SQLFactory {

	public AbstractSQLDB getDB(String db) {
		if(db.equalsIgnoreCase("SQLServer"))
			return new SQLServer();
		return null;
	}
	
}

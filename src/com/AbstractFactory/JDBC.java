package com.AbstractFactory;

public class JDBC extends SQLFactory {

	public AbstractSQLDB getDB(String db) {
		if(db.equalsIgnoreCase("MySQL"))
			return new MySQL();
		if(db.equalsIgnoreCase("OracleSQL"))
			return new OracleSQL();
		if(db.equalsIgnoreCase("PostgreSQL"))
			return new PostgreSQL();
		return null;
	}
	
}

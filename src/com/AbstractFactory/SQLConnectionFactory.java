package com.AbstractFactory;

public class SQLConnectionFactory {
	
	public AbstractSQLDB getConnection(String motor){
		if(motor.equalsIgnoreCase("MySQL"))
			return new MySQL();
		if(motor.equalsIgnoreCase("OracleSQL"))
			return new OracleSQL();
		if(motor.equalsIgnoreCase("PostgreSQL"))
			return new PostgreSQL();
		return null;
	}
	
	public static void main(String[] args) {
		SQLConnectionFactory c= new SQLConnectionFactory();
		c.getConnection("postgresql").connect();
	}
}

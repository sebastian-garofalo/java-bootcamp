package com.AbstractFactory;

public class AbstractFactory {
	
	public SQLFactory getConnection(String acc) {
		if(acc.equalsIgnoreCase("JDBC"))
			return new JDBC();
		if(acc.equalsIgnoreCase("OLEDB"))
			return new OLEDB();
		return null;
	}

	public static void main(String[] args) {
		/**
		 * JDBC -> OracleSQL, PostgreSQL, MySQL
		 * OLEDB -> SQLServer
		 **/
		AbstractFactory af = new AbstractFactory();
		SQLFactory sqlf = af.getConnection("jdbc");
		AbstractSQLDB sqldb = sqlf.getDB("oraclesql");
		sqldb.connect();
		
		sqlf = af.getConnection("oledb");
		sqldb = sqlf.getDB("sqlserver");
		sqldb.connect();
	}
}

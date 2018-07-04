package exercise1_singleton;

import DB.DBdummy;

public class DBConnection {
	//SINGLETON 
	private static DBConnection connection = null;
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		
		if (connection == null){
			connection = new DBConnection();
		}
		return connection;
	}
	
	public boolean connection(String user, String pass) {
		return DBdummy.login(user,pass);
	}
}
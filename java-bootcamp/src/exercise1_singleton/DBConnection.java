package exercise1_singleton;

public class DBConnection {
	//SINGLETON 
	private static DBConnection connection = new DBConnection();
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		return connection;
	}
	
	public boolean connection(String user, String pass) {
		return DBdummy.login(user,pass);
	}
}
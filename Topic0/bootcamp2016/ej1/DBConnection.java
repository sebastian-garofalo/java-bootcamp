package bootcamp2016.ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection;
	private static DBConnection instance = null;
	
	private DBConnection() {
		String driver = "...";
		String url = "...";
		String user = "user name";
		String pwd = "password";					
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException | SQLException  e ) {
			e.printStackTrace();		
		}
	}
	
	public static DBConnection getInstance() {
		if (instance == null)
			instance = new DBConnection();
		return instance;
	}
	
	public static Connection getConnection() {
		return connection;
	}	
	
}

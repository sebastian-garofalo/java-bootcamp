/*
* @author Braian Varona
* @version 1.0
*/

package bootcamp2016.ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	private static Connection connection;
	private static dbConnection instance = null;
	
	private dbConnection() {
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
	
	public static dbConnection getInstance() {
		if (instance == null)
			instance = new dbConnection();
		return instance;
	}
	
	public static Connection getConnection() {
		return connection;
	}	
	
}

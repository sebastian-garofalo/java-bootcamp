//Create a singleton example for a database connection

package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

	
	private String dbDriver = "com.mysql.jdbc.Driver";
	private static String user = " root ";
	private static String pass = " abc123";
	private static String dbname = "base de datos";
	private Connection conn;
	private static SingletonConnection singleton;

	
	private SingletonConnection() {
		try {
			Class.forName(dbDriver);
			conn = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public static SingletonConnection getInstance() {
		if (singleton == null)
			singleton = new SingletonConnection();
		return singleton;
	}
	

	public Connection getConnection() {
		try {
			if (conn == null || conn.isClosed())
				conn = DriverManager.getConnection("jdbc:mysql://localhost/" + dbname, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
		}
		return conn;
	}
	

	public void releaseConexion() {
		try {
			if (!conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
		}
	}

}

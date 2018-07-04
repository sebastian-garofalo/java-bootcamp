//Create a proxy example for database accesor clases
package ProxyConecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProxyConnection {

	private String dbDriver = "com.mysql.jdbc.Driver";
	private static String user = "root";
	private static String pass = "abc123";
	private static String dbname = "database";
	private Connection conn;

	public ProxyConnection() {
		try {
			Class.forName(dbDriver);
			conn = null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			if (conn == null || conn.isClosed())
				conn = DriverManager.getConnection("jdbc:mysql://localhost/" + dbname, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public void releaseConnection() {
		try {
			if (!conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package AbstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection implements SQL {

	private static String host = "localhost";
	private static String user = "admin";
	private static String password = "admin";
	private static String dbName = "mySQLDB";
	private String dbDriver = "com.mysql.jdbc.Driver";
	private Connection connection;
	private static MySQLConnection conn;

	private MySQLConnection() {
		try {
			Class.forName(dbDriver);
			connection = null;
		} catch (Exception e) {
		}
	}

	@Override
	public Connection getConnection() {
		try {
			if (connection == null || connection.isClosed())
				connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + dbName, user, password);
		} catch (Exception e) {
		}
		return connection;
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		try {
			if (!connection.isClosed())
				connection.close();
		} catch (Exception e) {
		}
	}

	public static MySQLConnection getInstance() {
		if (conn == null) {
			conn = new MySQLConnection();
		}
		return conn;
	}
}

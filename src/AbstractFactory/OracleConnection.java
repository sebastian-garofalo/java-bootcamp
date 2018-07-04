package AbstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnection {

	private static String host = "localhost";
	private static String user = "admin";
	private static String password = "admin";
	private static String dbName = "oracleDb";
	private String dbDriver = "com.oracle.jbcd.Driver";
	private Connection connection;
	private static OracleConnection instance;

	
	public OracleConnection() {
		try {
			Class.forName(dbDriver);
			connection = null;
		} catch (Exception e) {
		}
	}

	
	public static OracleConnection getInstance() {
		if (instance == null) {
			instance = new OracleConnection();
		}
		return instance;
	}

	public Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection("jdbc:oracle://" + host + "/" + dbName, user, password);
			}
		} catch (Exception e) {
		}
		return connection;
	}

	public void closeConnection() {
		try {
			if (!connection.isClosed()) {
				connection.close();
			}
		} catch (Exception e) {

		}
	}
}

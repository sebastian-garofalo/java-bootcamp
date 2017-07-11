package topiczeroone;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author andres.vaninetti
 * 
 *         Trying to apply Singleton pattern to a DB connection.
 *
 */
public class SingletonDBConnection {

	private static final String DATASOURCE_CONNECTION = "datasource.properties";

	private static SingletonDBConnection singlettonDBConnection = null;
	private static Object flag = new Object();

	private ConnectionData connectionData;

	/**
	 * Constructor method
	 * 
	 * @throws IOException
	 * 
	 */
	private SingletonDBConnection() throws IOException {
		InputStream input = SingletonDBConnection.class.getClassLoader().getResourceAsStream(DATASOURCE_CONNECTION);
		Properties properties = new Properties();
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}
		}
		connectionData = new ConnectionData(properties.getProperty("user"), properties.getProperty("password"),
				properties.getProperty("localhost"));
		try {
			connectionData.doDBConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static SingletonDBConnection getInstance() throws IOException {
		if (singlettonDBConnection == null) {
			synchronized (flag) {
				if (singlettonDBConnection == null) {
					singlettonDBConnection = new SingletonDBConnection();
				}
			}
		}
		return singlettonDBConnection;
	}

}

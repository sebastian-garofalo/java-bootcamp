package topiczeroone;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionData {

	private String username;
	private String password;
	private String host;

	public ConnectionData(String user, String password, String host) {
		this.username = user;
		this.password = password;
		this.host = host;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public String getHost() {
		return this.host;
	}

	public void doDBConnection() throws SQLException {
		System.out.println("Connection established for: " + this.username);
		DriverManager.getConnection(this.host);
	}

}

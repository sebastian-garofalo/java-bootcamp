package bootcamp2016.ej4;

import java.sql.Connection;

// This class is a "product"

public class DataBase {

	private String user = "";
	private String pwd = "";
	private String driver = "";
	private String connectionType = "";
	private String url = "";
	private Connection connection;
	
	public DataBase(String user, String pwd) {
		this.user = user;
		this.pwd = pwd;
	}
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}

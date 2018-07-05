package ProxyConecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Proxy {
	
	ProxyConnection instance;
	
	public Connection getConnection(){
		if(instance==null) instance = new ProxyConnection();;
		return instance.getConnection();
	}
	
	public void releaseConnection(){
		if(instance==null) instance = new ProxyConnection();
		instance.releaseConnection();
	}
	

}

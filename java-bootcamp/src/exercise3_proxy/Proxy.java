package exercise3_proxy;

import exercise1_singleton.DBdummy;

public class Proxy implements DBInterface{
	
	private RealDBConnection connection = new RealDBConnection();
	
	@Override
	public void setPass(String pass) {
		connection.setPass(pass);
	}
	
	@Override
	public void setUser(String user) {
		connection.setUser(user);
	}
	
	@Override
	public String getUser() {
		return connection.getUser();
	}
	
	@Override
	public String getPass() {
		return connection.getPass();
	}
	
	@Override
	public String query(String request) {
		return DBdummy.query(request);
	}
	
	@Override
	public boolean connect() {
		if (connection.getUser().equals("Juan")) // Juan can't connect to the DB! 
			return false;
		return connection.connect();
	}

	@Override
	public boolean closeSession() {
		return connection.closeSession();
	}
	
}

package exercise3_proxy;

public interface DBInterface {

	public void setUser(String user);
	public void setPass(String pass);
	public String getUser();
	public String getPass();
	public String query(String request);
	public boolean connect();
	public boolean closeSession();
	
	
}

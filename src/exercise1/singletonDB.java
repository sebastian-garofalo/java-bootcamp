package exercise1;

/**
 * @author Fernanda M. Gonzalez
 */
public class singletonDB {
	
	private String dB_name;
	private String dB_user;
	private String dB_pass;
	private String dB_host;
	private static singletonDB db;
	
	/**
	 * @param dB_name
	 * @param dB_user
	 * @param dB_pass
	 * @param dB_host
	 */
	private singletonDB(String dB_name, String dB_user, String dB_pass, String dB_host) {
		this.dB_name = dB_name;
		this.dB_user = dB_user;
		this.dB_pass = dB_pass;
		this.dB_host = dB_host;
	}
	
	/**
	 * 
	 * @param name
	 * @param user
	 * @param pass
	 * @param host
	 * @return
	 */
	public static singletonDB getInstance(String name, String user, String pass, String host){
		if (db == null) {
			db = new singletonDB(name, user, pass, host);
		}
		return db;
	}

	/**
	 * @return the dB_name
	 */
	public String getDB_name() {
		return dB_name;
	}

	/**
	 * @param dB_name the dB_name to set
	 */
	public void setDB_name(String dB_name) {
		this.dB_name = dB_name;
	}

	/**
	 * @return the dB_user
	 */
	public String getDB_user() {
		return dB_user;
	}

	/**
	 * @param dB_user the dB_user to set
	 */
	public void setDB_user(String dB_user) {
		this.dB_user = dB_user;
	}

	/**
	 * @return the dB_pass
	 */
	public String getDB_pass() {
		return dB_pass;
	}

	/**
	 * @param dB_pass the dB_pass to set
	 */
	public void setDB_pass(String dB_pass) {
		this.dB_pass = dB_pass;
	}

	/**
	 * @return the dB_host
	 */
	public String getDB_host() {
		return dB_host;
	}

	/**
	 * @param dB_host the dB_host to set
	 */
	public void setDB_host(String dB_host) {
		this.dB_host = dB_host;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isConnect(){
		return (db != null);
	}
	
}

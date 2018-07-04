package Builder;

public class MySQLBuilder {

	private BuilderConnection con;
	
	public MySQLBuilder() {
		con = new BuilderConnection();
	}

	//@Override
	public void buildUser() {
		con.setUser("root");
	}

	//@Override
	public void buildPass() {
		con.setPass("abc123");		
	}

	//@Override
	public void buildDbname() {
		con.setDbname("mysqlDB");		
	}

	//@Override
	public BuilderConnection getConnection() {
		return con;
		
	}
}

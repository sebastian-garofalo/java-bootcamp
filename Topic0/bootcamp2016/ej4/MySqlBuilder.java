package bootcamp2016.ej4;

public class MySqlBuilder extends DBBuilder {

	public MySqlBuilder(String user, String pwd) {
		super(user,pwd);
	}
	
	@Override
	public void buildConnectionType() {
		db.setConnectionType("MySql");
	}

	@Override
	public void buildDriver() {
		db.setDriver("com.mysql.jdbc.Driver"); 
	}

	@Override
	public void buildUrl() {
		db.setUrl("jdbc:mysql://localhost/nombre_DB?autoReconnect=true");
		
	}

}

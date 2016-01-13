package bootcamp2016.ej4;

public  class PostgreSqlBuilder extends DBBuilder {

	public PostgreSqlBuilder(String user, String pwd) {
		super(user,pwd);
	}
	
	
	@Override
	public void buildConnectionType() {
		db.setConnectionType("PostgreSql");		
	}

	@Override
	public void buildDriver() {
		db.setDriver("org.postgresql.Driver");		
	}

	@Override
	public void buildUrl() {
		db.setUrl("jdbc:postgresql://hostname:port/dbname");		
	}

}

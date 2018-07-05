package AbstractFactory;

public class SqlFactory extends AbstractFactory {

	
	public MySQLConnection getSQL(String dbName) {
		if (dbName.equalsIgnoreCase("mysql")) {
			return MySQLConnection.getInstance();
		}
		return null;
	}

	
	public OracleConnection getOracle(String dbName) {
		// TODO Auto-generated method stub
		return null;
	}

}

package AbstractFactory;

public class OracleFactory extends AbstractFactory {

	public MySQLConnection getSQL(String dbName) {
		// TODO Auto-generated method stub
		return null;
	}

	public OracleConnection getOracle(String dbName) {
		if (dbName.equalsIgnoreCase("oracle")) {
			return OracleConnection.getInstance();
		}
		return null;
	}
}

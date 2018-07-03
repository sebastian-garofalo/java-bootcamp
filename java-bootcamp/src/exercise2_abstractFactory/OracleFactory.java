package exercise2_abstractFactory;

public class OracleFactory implements AbstractFactory {
	
	@Override
	public MicrosoftSQLServerConnection getMicrosoftSQLServerConnection(String factory) {
		return null;
	}
	@Override
	public OracleConnection getOracleConnection(String factory) {
		if(factory.equals("ODBC"))
			return new OracleODBC();
		if(factory.equals("OLEDB"))
			return new OracleOLEDB();
		return null;
	}
}

package exercise2_abstractFactory;

public interface AbstractFactory {
	
	public MicrosoftSQLServerConnection getMicrosoftSQLServerConnection(String factory);
	public OracleConnection getOracleConnection(String factory);

}

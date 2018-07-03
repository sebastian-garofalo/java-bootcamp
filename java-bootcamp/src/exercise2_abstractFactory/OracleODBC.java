package exercise2_abstractFactory;

public class OracleODBC implements OracleConnection{

	@Override
	public void Connection() {
		System.out.println("Oracle ODBC connection");	
	}

}

package exercise2_abstractFactory;

public class MicrosoftODBC implements MicrosoftSQLServerConnection{
	
	@Override
	public void Connection() {
		System.out.println("Microsoft ODBC connection");
		
	}

}

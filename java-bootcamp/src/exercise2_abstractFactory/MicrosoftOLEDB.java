package exercise2_abstractFactory;

public class MicrosoftOLEDB implements MicrosoftSQLServerConnection{

	@Override
	public void Connection() {
		System.out.println("Microsoft OLEDB connection");
	}


}

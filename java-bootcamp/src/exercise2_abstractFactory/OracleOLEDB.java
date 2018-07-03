package exercise2_abstractFactory;

public class OracleOLEDB implements OracleConnection{

	@Override
	public void Connection() {
		System.out.println("Oracle OLEDB connection");
	}

}

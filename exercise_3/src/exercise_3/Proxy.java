package exercise_3;

public class Proxy implements ConnectionDB{
	

	public static String driver;
	public static String user;
	public static String password;
	public static String host;
	
	private Proxy connection = new Proxy();

	@Override
	public void SetDriver(String driver) {
		Proxy.driver = driver;
		
	}

	@Override
	public void SetUser(String user) {
		Proxy.user = user;
		
	}

	@Override
	public void SetPass(String password) {
		Proxy.password = password;
		
	}

	@Override
	public void SetHost(String host) {
		Proxy.host = host;
		
	}

	@Override
	public boolean Connection() {
		return connection.Connection();
	}
	
}

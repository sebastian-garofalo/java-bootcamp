package exercise3;

/**
 * @author Fernanda M. Gonzalez
 */
public class proxyConnection implements connectionInterface {
	
	private realConnection db = new realConnection();

	@Override
	public boolean isConnect() {
		return db.isConnect();
	}

	@Override
	public String getQuery(String action) {
		return db.getQuery(action);
	}

}

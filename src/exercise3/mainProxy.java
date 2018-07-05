package exercise3;

/**
 * @author Fernanda M. Gonzalez
 */
public class mainProxy {

	public static void main(String[] args) {
		connectionInterface db = new proxyConnection();
		
		if (db.isConnect()) {
			System.out.println("Connection Success");
			System.out.println(db.getQuery("UPDATE"));
		} else {
			System.out.println("Connection Failure");
		}

	}

}

package bootcam2016.ej3;

import java.sql.ResultSet;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		DBInterface db = new ProxyDB();
		
		String query = "SELECT ... ";
		ResultSet result = db.executeQuery(query);		
		/* .
		 * 
		 */
		String operation = "INSERT ...";
		db.executeOperation(operation);
	}

}

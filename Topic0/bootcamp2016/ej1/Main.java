package bootcamp2016.ej1;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		DBConnection singletonConnection = DBConnection.getInstance();
		Connection con = singletonConnection.getConnection();		
		
		/* 
		 * executing actions  
		 */
	}
}

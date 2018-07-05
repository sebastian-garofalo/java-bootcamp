package exercise1;

/**
 * @author Fernanda M. Gonzalez
 */
public class mainSingleton {

	public static void main(String[] args) {
		
		singletonDB dbConnect = singletonDB.getInstance("test", "Usuario", "anything", "somewhere");
		
		if (dbConnect.isConnect()) {
			System.out.println("Connection Success");
			System.out.println("DataBase Name: " + dbConnect.getDB_name());	
			System.out.println("DataBase User: " + dbConnect.getDB_user());	
			System.out.println("DataBase Password: " + dbConnect.getDB_pass());
			System.out.println("DataBase Host: " + dbConnect.getDB_host());	
		}
		else{
			System.out.println("Connection Failure");
		}
			
	}

}

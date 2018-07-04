package DB;

public class DBdummy {
	
	public static boolean connection = false;
	
	public static boolean login(String user, String pass) {
		
		if (!connection)
		if(user.equals("pepito")&(pass.equals("pepito"))) {
			connection = true;
			return true;
		}
		return false;
	}
	
	public static boolean closeSession() {
		if(connection) {
			connection = false;
			return true;
		}
		return false;
	}

	public static String query(String request) {
		return "This is a query";
	}
}

package exercise1_singleton;

public class DBdummy {
	
	public static boolean login(String user, String pass) {
		if(user.equals("pepito")&(pass.equals("pepito")))
			return true;
		return false;
	}
	
	public boolean closeSesion() {
		return true;
	}

	public String query(String request) {
		return "this is a query";
	}
}

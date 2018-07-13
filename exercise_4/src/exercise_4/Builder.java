package exercise_4;

public class Builder extends BuilderConnection {

	@Override
	public void buildHost() {
		// TODO Auto-generated method stub
		Conn.setHost("127.0.0.1");
	}

	@Override
	public void buildUser() {
		// TODO Auto-generated method stub
		Conn.setUser("Simon");
	}

	@Override
	public void buildPass() {
		// TODO Auto-generated method stub
		Conn.setPass("wrew#455s");
	}
	
}

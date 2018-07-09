package exercise_4;

abstract class BuilderConnection {
	 protected ConnectionDB Conn;

	    public ConnectionDB getConn() {
	        return Conn;
	    }

	    public void createNewPizzaProduct() {
	    	Conn = new ConnectionDB();
	    }

	    public abstract void buildHost();
	    public abstract void buildUser();
	    public abstract void buildPass();
}

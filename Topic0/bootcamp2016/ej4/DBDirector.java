package bootcamp2016.ej4;

public class DBDirector {

	private DBBuilder dbBuilder;
	
	public DBDirector(DBBuilder dbBuilder) {
		this.dbBuilder = dbBuilder;
	}
	
	public void constructDB() {
		dbBuilder.buildDriver();
		dbBuilder.buildUrl();
		dbBuilder.buildConnectionType();
		dbBuilder.buildConnection();
	}
	
	public DataBase getDataBase() {
		return dbBuilder.getDataBase();
	}
}

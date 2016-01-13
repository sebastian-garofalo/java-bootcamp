package bootcamp2016.ej4;

import java.sql.DriverManager;

public abstract class DBBuilder {

	protected DataBase db; 
	
	public DBBuilder(String user, String pwd) {
		db = new DataBase(user,pwd);
	}
	
	public DataBase getDataBase() {
		return db;
	}
	
	public void buildConnection() {
        try {
    		Class.forName(db.getDriver());
			db.setConnection(DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPwd()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public abstract void buildConnectionType();
	public abstract void buildDriver();
	public abstract void buildUrl();
}

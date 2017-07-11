package bootcam2016.ej3;

import java.sql.ResultSet;

public class ProxyDB implements DBInterface {

	private DataBase db;
	
	@Override
	public ResultSet executeQuery(String query) {
		if (db == null)
			db = new DataBase();
		return db.executeQuery(query);
	}

	@Override
	public void executeOperation(String operation) {
		if (db == null)
			db = new DataBase();
		db.executeOperation(operation);
	}

}

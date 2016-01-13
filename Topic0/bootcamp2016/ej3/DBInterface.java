package bootcam2016.ej3;

import java.sql.ResultSet;

public interface DBInterface {

	public ResultSet executeQuery(String query);
	public void executeOperation(String operation); // insert, update or delete
}

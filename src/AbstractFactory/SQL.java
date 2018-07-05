package AbstractFactory;

import java.sql.Connection;

public interface SQL {

	public Connection getConnection();
	public void closeConnection();
}


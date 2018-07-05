package AbstractFactory;

import java.sql.Connection;

public interface Oracle {

	public Connection getConnection();
	public void closeConnection();
}

package bootcamp2016.ej2;

public class MySqlConnectionFactoy implements ConnectionFactory {

	@Override
	public Connection createConnection() {		
		return new MySqlConnection();
	}

}

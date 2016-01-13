package bootcamp2016.ej2;

public class MySqlConnectionFactory implements ConnectionFactory {

	@Override
	public Connection createConnection() {		
		return new MySqlConnection();
	}

}

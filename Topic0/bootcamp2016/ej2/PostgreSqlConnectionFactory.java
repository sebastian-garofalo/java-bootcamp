package bootcamp2016.ej2;

public class PostgreSqlConnectionFactory implements ConnectionFactory {

	@Override
	public Connection createConnection() {
		return new PostgreSqlConnection();
	}

}

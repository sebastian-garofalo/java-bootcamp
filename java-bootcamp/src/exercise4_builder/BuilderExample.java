package exercise4_builder;

public class BuilderExample {

	public static void main(String[] args) {
		DirectorBuilder director = new DirectorBuilder();
		MicrosoftSQLConnectionBuilder microsoftBuilder = new MicrosoftSQLConnectionBuilder();
		OracleConnectionBuilder oracleBuilder = new OracleConnectionBuilder();
		
		director.setBuilder(microsoftBuilder);
		director.buildConnection();
	
		DBConnection connection = director.getConnection();
		System.out.println(connection);
		
		director.setBuilder(oracleBuilder);
		director.buildConnection();
		
		connection = director.getConnection();
		System.out.println(connection);
	}

}

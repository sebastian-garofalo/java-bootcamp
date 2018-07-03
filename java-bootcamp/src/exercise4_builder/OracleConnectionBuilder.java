package exercise4_builder;

public class OracleConnectionBuilder extends AbstractBuilder{
	//Concret Builder
	
	public OracleConnectionBuilder(){
		super.connection = new DBConnection();
	}
	
	public void buildPath(){
		super.connection.setPath("default path for Oracle");
	}

	public void buildServerName(){
		super.connection.setServerName("Oracle");
	}

	public void buildPort(){
		super.connection.setPort(1521);		
	}

	public void buildProtocol(){
		super.connection.setProtocol("TCP");	
	}

}

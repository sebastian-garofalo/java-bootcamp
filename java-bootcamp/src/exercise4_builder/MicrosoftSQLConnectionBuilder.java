package exercise4_builder;

public class MicrosoftSQLConnectionBuilder extends AbstractBuilder {
	//Concret Builder
	
	public MicrosoftSQLConnectionBuilder() {
		super.connection = new DBConnection();
	}

	public void buildPath() {
		super.connection.setPath("default path for Microsoft");	
	}
	
	public void buildServerName() {
		super.connection.setServerName("MicrosoftSQLServer");
	}

	public void buildPort() {
		super.connection.setPort(1433);
	}
	
	public void buildProtocol() {
		super.connection.setProtocol("TCP/IP");
	}
}

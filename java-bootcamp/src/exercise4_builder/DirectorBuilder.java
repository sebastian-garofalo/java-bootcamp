package exercise4_builder;

public class DirectorBuilder {
	// Director
	private AbstractBuilder connectionBuilder;
	
	public void setBuilder(AbstractBuilder builder) {
		connectionBuilder = builder;
	}
	
	public DBConnection getConnection() {
		return connectionBuilder.getConnection();
	}
	
	public void buildConnection() {
		connectionBuilder.buildPath();
		connectionBuilder.buildPort();
		connectionBuilder.buildProtocol();
		connectionBuilder.buildServerName();
	}
}

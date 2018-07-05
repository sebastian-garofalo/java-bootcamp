package Builder;

public class ConnDirector {

	private ConnBuilder builder = null;

	public ConnDirector(ConnBuilder builder) {
		this.builder = builder;
	}

	public void ConnBuilder() {
		builder.buildUser();
		builder.buildPass();
		builder.buildDbname();
	}

	public BuilderConnection getConnection() {
		return builder.getConnection();
	}
}

package Builder;

public abstract class ConnBuilder {

	public abstract void buildUser();

	public abstract void buildPass();

	public abstract void buildDbname();

	public abstract BuilderConnection getConnection();
}

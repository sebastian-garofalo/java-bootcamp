//Create a abstract factory example for diferent type of SQL connections

package AbstractFactory;

public abstract class AbstractFactory {

	public abstract MySQLConnection getSQL(String dbName);

	public abstract OracleConnection getOracle(String dbName);

}

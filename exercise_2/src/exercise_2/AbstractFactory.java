package exercise_2;

public abstract class AbstractFactory {
	abstract SQLConnection getConnection(String driver);
}

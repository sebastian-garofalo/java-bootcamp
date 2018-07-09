package exercise_3;

public interface ConnectionDB {
	public void SetDriver (String driver);
	public void SetUser (String user);
	public void SetPass (String password);
	public void SetHost (String host);
	public boolean Connection();
}

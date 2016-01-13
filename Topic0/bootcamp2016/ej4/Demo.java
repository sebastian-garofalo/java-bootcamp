package bootcamp2016.ej4;

public class Demo {

	public static void main(String[] args) {

		DBBuilder dbBuilder = new MySqlBuilder("Braian Varona","bootcamp-2016");
		DBDirector dbDirector = new DBDirector(dbBuilder);
		dbDirector.constructDB();
		DataBase db = dbDirector.getDataBase();
		
		// ...
	}

}

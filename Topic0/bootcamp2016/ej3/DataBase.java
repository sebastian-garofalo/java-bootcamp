package bootcam2016.ej3;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase implements DBInterface {

	private Connection connection = null;
	
	public DataBase() {
		String driver = "...";
		String url = "...";
		String user = "user name";
		String pwd = "password";					
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException | SQLException  e ) {
			e.printStackTrace();		
		}
	}
	
	@Override
	public ResultSet executeQuery(String query) {
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			return stmt.executeQuery();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;		
	}

	@Override
	public void executeOperation(String operation) {
		try {
			Statement st = (Statement) connection.createStatement();
			st.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}

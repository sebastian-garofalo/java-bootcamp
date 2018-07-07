import java.sql.*;
public class Singleton {
	  // Properties
    private static Connection conn = null;
    private String driver;
    private String host;
    private String user;
    private String password;
 
    // Constructor
 private Singleton(){
 
	 String host = "jdbc:mysql://localhost:3306/test";
	 String driver = "com.mysql.jdbc.Driver";
	 String user = "user";
	 String password = "password";
  
 try{
     Class.forName(driver);
     conn = DriverManager.getConnection(host, user, password);
 }
 catch(ClassNotFoundException | SQLException e){
     e.printStackTrace();
 }
    } // End constructor
 
    // Methods
    public static Connection getConnection(){
  
 if (conn == null){
     new Singleton();
 }
  
 return conn;
    } // End getConnection
}
}

package exercise2_abstractFactory;

public class FactoryProducer {
	

	 public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("Microsoft")){
	         return new MicrosoftFactory();
	      }
	      else if(choice.equalsIgnoreCase("Oracle")){
	         return new OracleFactory();
	      }
	      return null;
	   }
	 
		public static void main(String[] args) {
			
			Connection connect;
			
			AbstractFactory factory = getFactory("Microsoft");
			connect = factory.getMicrosoftSQLServerConnection("ODBC");
			connect.Connection();
			connect = factory.getMicrosoftSQLServerConnection("OLEDB");
			connect.Connection();
			
			factory = getFactory("Oracle");
			connect = factory.getOracleConnection("ODBC");
			connect.Connection();
			connect = factory.getOracleConnection("OLEDB");
			connect.Connection();
		
			
		}	
			
		
}

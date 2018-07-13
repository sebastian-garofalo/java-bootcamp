package exercise_2;

public class DriverFactory extends AbstractFactory {
	@Override
	   public SQLConnection getConnection(String DriverType){
	   
	      if(DriverType == null){
	         return null;
	      }		
	      
	      if(DriverType.equalsIgnoreCase("MySQL")){
	         return new MySQL();
	         
	      }else if(DriverType.equalsIgnoreCase("OracleSQL")){
	         return new OracleSQL();
	         
	      }
	      
	      return null;
	   }
}

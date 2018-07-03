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
}

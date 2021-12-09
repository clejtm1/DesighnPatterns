
public class FactoryProducer {
	public  static AbstractFactory getFactory(String choice) 
	{
	    if(choice.equalsIgnoreCase("GAS")){
	        return new GasFactory();         
	     }else if(choice.equalsIgnoreCase("E")){
	        return new EFactory();
	     }else if(choice.equalsIgnoreCase("D")){
	         return new DFactory();
	     }
	     return null;
	}

}

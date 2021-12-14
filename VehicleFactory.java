
public class VehicleFactory {
	public  static Vehicle getVehicleFactory(String choice) 
	{
	    if(choice.equalsIgnoreCase("CAR")){
	        return new Car();         
	     }else if(choice.equalsIgnoreCase("TRUCK")){
	        return new Truck();
	     }else if(choice.equalsIgnoreCase("BOAT")){
	         return new Boat();
	     }
	     return null;
	}
}

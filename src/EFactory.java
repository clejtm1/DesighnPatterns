
public class EFactory extends AbstractFactory {
static  double ppu=1.0;
public void setPPU(double price) 
{
	ppu=price;
}
public double getPPU()
{ 
	return ppu;
}

public  Vehicle getVehicle(String choice) 
{
    if(choice.equalsIgnoreCase("CAR")){
        return new eCar();         
     }else if(choice.equalsIgnoreCase("BOAT")){
        return new eBoat();
     }else if(choice.equalsIgnoreCase("TRUCK")){
         return new eTruck();
     }
     return null;
}

}

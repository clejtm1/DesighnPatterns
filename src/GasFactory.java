
public class GasFactory extends AbstractFactory {

static double ppu=1.0;
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
        return new gasCar();         
     }else if(choice.equalsIgnoreCase("BOAT")){
        return new gasBoat();
     }else if(choice.equalsIgnoreCase("TRUCK")){
         return new gasTruck();
     }
     return null;
}

}

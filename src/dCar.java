
public class dCar implements Vehicle {
	private double fuelCapacity=50.0;
	private double mpu=10.0;
	private double currentFuel;
	private double miles;
	private String name="DIESEL CAR";
	
	public dCar() 
	{
		currentFuel=(fuelCapacity/2.0);
	}
	
	public void travel(double miles) 
	{   this.miles=miles;
	
		if((currentFuel-(this.miles/mpu))<=0.0) 
		{
			System.out.println("We are traveling "+currentFuel*mpu+"miles in our "+this.name);
			this.miles-=(currentFuel*mpu);
			currentFuel=0;
			System.out.println("We are refilling  a full tank in "+this.name+" the cost is $"+this.refuel(fuelCapacity));
		}
		System.out.println("We are traveling "+this.miles+" miles.");
		currentFuel-=(this.miles/mpu);
	}
	public double getEmptyUnits() 
	{
		
		return fuelCapacity-currentFuel;
	}
	public double refuel(double fuelUnits) 
	{
		System.out.println("We are refueling"+this.name+"tank");
		if((fuelUnits>=this.getEmptyUnits()))
		{
			double gasTotal=0;
			gasTotal=this.getEmptyUnits();
			//System.out.println("You got a full tank when you filled"+gasTotal+"units");
			currentFuel=fuelCapacity;
			return gasTotal*DFactory.ppu;
		 
		}
		else
		{
			currentFuel+=fuelUnits;
			return fuelUnits*DFactory.ppu;
		}
			
		
	}

}



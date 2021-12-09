import java.util.*;
//Create 3 different types of factories gas, diesel, and electric vehicles
//Each factory has 3 different types of vehicles ,cars, trucks and boats
//Each type of  vehicle (gCar,gTruck, gBoat, dCar, dTruck,dBoat,eCar,eTruck,eBoat) has a fuel capacity  and miles per unit (mpu)
//When each vehicle travels a certain amount it uses an amount of fuel in the tank (or battery for electric vehicles) distanceTraveled/mpu
//Each type of fuel (gas, deisel, electric) has a price which changes daily 
//when a tank is refueled charge  according to the amount it is filled up * price per unit
public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter gas for a gas vehicle, E for an electric vehicle and D for a diesel vehicle");
String vehicleFactory=scan.next();
AbstractFactory f=FactoryProducer.getFactory(vehicleFactory);
System.out.println("Enter in how much dollars you are paying per unit of fuel");
double ppu=scan.nextDouble();
f.setPPU(ppu);
System.out.println("Enter car to get a  car, truck to get a  truck, boat to  get a boat ");
String vehicleType=scan.next();
Vehicle v=f.getVehicle(vehicleType);

v.travel(210.0);
System.out.println("Empty Units"+v.getEmptyUnits());
double r=3.0;
System.out.println("Refuel for $"+v.refuel(r));
System.out.println("Empty Units"+v.getEmptyUnits());
	}

}

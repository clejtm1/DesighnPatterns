
public interface Vehicle {
//when traveling you use up fuel according to how much you traveled and the fuel capacity of the vehicle
public void travel(double miles);
//get how many more units till you are full
public double getEmptyUnits();
//refill the tank (the maximum you can fill up is how many empty units there are in the tank and get the price you just payed the gas station (when you refuel up you pay on the spot)
public double refuel(double fuelUnits);



}

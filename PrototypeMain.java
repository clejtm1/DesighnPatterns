
public class PrototypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    VehicleCache.loadCache();
    Vehicle clonedVehicle = (Vehicle) VehicleCache.getVehicle(3);
    System.out.println("Vehicle : " + clonedVehicle.getType());
    clonedVehicle.drive();
	}

}

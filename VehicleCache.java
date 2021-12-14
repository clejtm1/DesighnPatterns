import java.util.*;
import java.sql.*;
public class VehicleCache {
private static Hashtable<Integer, Vehicle> vehicleMap  = new Hashtable<Integer, Vehicle>();

public static Vehicle getVehicle(int vehicleId) {
    Vehicle cachedVehicle = vehicleMap.get(vehicleId);
    return (Vehicle) cachedVehicle.clone();
 }
public static void loadCache() {
	Connection conn = null;
	conn = DatabaseConnection.getConnection();
	System.out.println("Connected to database");
	
	
	 try  {
		  String checkIDQuery="select * from vehicles;";
	      Statement stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(checkIDQuery);
	     
	      while (rs.next()) {
	    	int id=rs.getInt("id");
	    	String vehicleType=rs.getString("vehicleType");
	        Vehicle v=VehicleFactory.getVehicleFactory(vehicleType);
	        v.setId(id);
	        vehicleMap.put(v.getId(), v);
	       
	        
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();}
	  

 }

}

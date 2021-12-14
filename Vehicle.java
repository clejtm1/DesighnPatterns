
public abstract class Vehicle implements Cloneable {
	   private int id;
	   protected String type;
	   
	   abstract void drive();
	   
	   public String getType(){
	      return type;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId(int id) {
	      this.id = id;
	   }
	   
	   public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
}

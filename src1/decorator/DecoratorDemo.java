package decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars boringSedan=new Sedan();
		Cars leatherSedan=new LeatherSeatDecorator(boringSedan);
		Cars leatherLaneChangeSedan=new LaneChangeWarnDecorator(leatherSedan);
		Cars laneChangeSUV=new LaneChangeWarnDecorator(new SUV());
		/*
	
		boringSedan.drive();
		leatherSedan.drive();
		laneChangeSUV.drive();
		*/
		System.out.println("A new Sedan with no added features");
		boringSedan.drive();
		System.out.println("The same sedan with leather seats as an added feature ");
		leatherSedan.drive();
		System.out.println("The same sedan with lane change warning in addition to the previous added feature of laether seats");
		leatherLaneChangeSedan.drive();
		System.out.println("An new SUV with the added feature of lane change warning");
		laneChangeSUV.drive();
		

	}

}

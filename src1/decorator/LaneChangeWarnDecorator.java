package decorator;

public class LaneChangeWarnDecorator extends CarDecorator {
	public LaneChangeWarnDecorator(Cars decoratedCar)
	{
		super(decoratedCar);
	}
	//Override
	public void drive() 
	{
		decoratedCar.drive();
		LaneChange(decoratedCar);
	}
	private void LaneChange(Cars decoratedCar) 
	{
		System.out.println("Added Feature: Lane Change Warning System");
	}
}

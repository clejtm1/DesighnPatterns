package decorator;

public class LeatherSeatDecorator extends CarDecorator {
	public LeatherSeatDecorator(Cars decoratedCar)
	{
		super(decoratedCar);
	}
	//Override
	public void drive() 
	{
		decoratedCar.drive();
		LeatherSeats(decoratedCar);
	}
	private void LeatherSeats(Cars decoratedCar) 
	{
		System.out.println("Added Feature: Leather Seats");
	}

}

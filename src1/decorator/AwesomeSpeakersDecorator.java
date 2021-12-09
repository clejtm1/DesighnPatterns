package decorator;

public class AwesomeSpeakersDecorator extends CarDecorator {
	public AwesomeSpeakersDecorator(Cars decoratedCar)
	{
		super(decoratedCar);
	}
	//Override
	public void drive() 
	{
		decoratedCar.drive();
		AwesomeSpeakers(decoratedCar);
	}
	private void AwesomeSpeakers(Cars decoratedCar) 
	{
		System.out.println("Added Feature: Awesome Speakers");
	}
}

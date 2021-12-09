package decorator;

public abstract class CarDecorator implements Cars
{
protected Cars decoratedCar;
public CarDecorator(Cars decoratedCar) 
{
	this.decoratedCar=decoratedCar;
}
public void drive() 
{
	this.decoratedCar.drive();
}
}

package Inheritance;

public class Car extends Vehical
{
	private String name;
	private String color;
	
	public Car(String company, String type, String name, String color) 
	{
		super(company, type);
		this.name = name;
		this.color = color;
	}
	
	@Override
	public void move(int speed)
	{
		System.out.println("Car moving at " + speed + "kph.");
		super.move(speed);
	}
}

package Polymorphism;

class Car 
{
	private String engine;
	private int wheels;
	private String type;
	
	public Car(String engine, int wheels, String type) 
	{
		this.engine = engine;
		this.wheels = wheels;
		this.type = type;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public String getType() {
		return type;
	}
	
	public void startEngine()
	{
		System.out.println("No car available");
	}
	public void accelerate()
	{
		System.out.println("No car available");
	}
	public void brake()
	{
		System.out.println("No car available");
	}
}

class Mustang extends Car
{
	public Mustang(String engine, int wheels, String type) {
		super(engine, wheels, type);
	}
	
	public void startEngine()
	{
		System.out.println("Mustang started");
	}
	public void accelerate()
	{
		System.out.println("Mustang => 200RPM");
	}
	public void brake()
	{
		System.out.println("Mustang stopped");
	}
}

class Ferrari extends Car
{
	public Ferrari(String engine, int wheels, String type) {
		super(engine, wheels, type);
	}
	
	public void startEngine()
	{
		System.out.println("Ferrari started");
	}
	public void accelerate()
	{
		System.out.println("Ferrari => 250RPM");
	}
	public void brake()
	{
		System.out.println("Ferrari stopped");
	}
}

class Lamborgini extends Car
{
	public Lamborgini(String engine, int wheels, String type) {
		super(engine, wheels, type);
	}
	
	public void startEngine()
	{
		System.out.println("Lamborgini started");
	}
	public void accelerate()
	{
		System.out.println("Lamborgini => 220RPM");
	}
	public void brake()
	{
		System.out.println("Lamborgini stopped");
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		Car c=rand();
		System.out.println(c.getEngine() + " car has " + c.getWheels() + " Wheels and is a " + c.getType() + " car.");
		c.startEngine();
		c.accelerate();
		c.brake();
	}

	public static Car rand()
	{
		int n = (int) (Math.random() * 4 ) + 1;
		switch(n)
		{
			case 1:
				 return new Mustang("Offrode", 6, "SUV");
			case 2:
				 return new Ferrari("Racing", 4, "Sports");
			case 3:
				 return new Lamborgini("Racing", 4, "Super");
			case 4:
				 return new Car("Not available", 0, "Not available");
		}
		return null;
	}
}












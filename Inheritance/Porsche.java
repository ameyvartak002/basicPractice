package Inheritance;

public class Porsche extends Car
{
	private int speed=0;
	private int gears=1;
	
	public Porsche(String company, String type, String name, String color, int speed, int gears) 
	{
		super(company, type, name, color);
		this.speed = speed;
		this.gears = gears;
	}
	
	public void changeGears()
	{
		gears += 1;
		System.out.println("Gear shifted to " + gears);
		if(gears<=0)
		{
			speed -= 20;
		}
		else
		{
			speed += 20;
		}
		move(speed);
	}
}

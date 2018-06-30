package Inheritance;

public class Vehical 
{
	private String company;
	private String type;
	
	public Vehical(String company,String type)
	{
		this.company = company;
		this.type = type;
	}
	
	public void move(int speed)
	{
		System.out.println("Vehical is moving forward.");
	}
	
	public void start()
	{
		System.out.println("Vehical is started");
	}
	
	public void stop()
	{
		System.out.println("Vehical is stopped");
	}
}

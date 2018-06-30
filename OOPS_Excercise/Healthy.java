package OOPS_Excercise;

public class Healthy extends Hamburger
{
	Hamburger h = new Hamburger();
	private int basePrice = 0;
	
	public void burgerType()
	{
		System.out.println("Base price : " + (basePrice += h.getBrownBread()));
		
		h.additions(basePrice, 2);
	}
	
}

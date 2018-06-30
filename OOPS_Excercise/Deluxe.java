package OOPS_Excercise;

import java.util.Scanner;

public class Deluxe 
{
	Hamburger h = new Hamburger();
	private int basePrice = 0;
	Scanner sc = new Scanner(System.in);
	
	public void burgerType()
	{
		System.out.println("--------------------------------------------");
		System.out.println("Select type of bread \n1.White Bread = " + h.getWhiteBread() + "Rs."
												+ "\n2.Brown Bread = " + h.getBrownBread() + "Rs.");
		int c1 = sc.nextInt();
		if(c1 == 1)
			basePrice += h.getWhiteBread();
		else
			basePrice += h.getBrownBread();

		System.out.println("--------------------------------------------");
		System.out.println("Select type of meat \n1.Chicken = " + h.getChicken() + "Rs." 
											+"\n2.Beef = " + h.getBeef() + "Rs." 
											+"\n3.Becon = " + h.getBecon() + "Rs.");
		int c2 = sc.nextInt();
		if(c2 == 1)
			basePrice += h.getChicken();
		else if(c2 == 2)
			basePrice += h.getBeef();
		else
			basePrice += h.getBecon();
		
		System.out.println("Base Price : " + basePrice + "Rs.");
		
		basePrice += (h.getChips()+h.getDrinks());
		
		System.out.println("Adding... \nChips => " + h.getChips() + "Rs. \nDrinks => " + h.getDrinks() + "Rs.");
		System.out.println("Base Price = " + basePrice);
		h.additions(basePrice,3);
	}
}

package OOPS_Excercise;

import java.util.Scanner;

public class Hamburger 
{
	private int whiteBread = 20;
	private int brownBread = 30;
	private int chicken = 30;
	private int beef = 40;
	private int becon = 35;
	
	private int lettuce = 10;
	private int tomato = 10;
	private int carrot = 10;
	private int cheese = 15;
	
	private int spinitch = 10;
	private int cucumber = 10;
	
	private int chips = 30;
	private int drinks = 40;
	
	public int getWhiteBread() {
		return whiteBread;
	}

	public int getBrownBread() {
		return brownBread;
	}

	public int getChicken() {
		return chicken;
	}

	public int getBeef() {
		return beef;
	}

	public int getBecon() {
		return becon;
	}

	public int getLettuce() {
		return lettuce;
	}

	public int getTomato() {
		return tomato;
	}

	public int getCarrot() {
		return carrot;
	}

	public int getCheese() {
		return cheese;
	}

	public int getSpinitch() {
		return spinitch;
	}

	public int getCucumber() {
		return cucumber;
	}

	public int getChips() {
		return chips;
	}

	public int getDrinks() {
		return drinks;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void additions(int price, int n)
	{
		int c1,check1 = 0, check2 = 0, check3 = 0, check4 = 0, check5 = 0, check6 = 0;
		do {
		
		System.out.println("--------------------------------------------");
		System.out.println("Select type of additions \n1.Lettuce = " + getLettuce() + "Rs."
													+ "\n2.Tomato = " + getTomato() + "Rs."
												    + "\n3.Carrot = " + getCarrot() + "Rs."
												    + "\n4.Cheese = " + getCheese() + "Rs."
													+ "\n5.No additions.");
		if(n == 2)
		{
			System.out.println("Two extra healthy additions \n6.Spinitch = " + getSpinitch() + "Rs."
				               +"\n7.Cucumber = " + getCucumber() + "Rs.");
		}
		c1 = sc.nextInt();
		
		switch(c1)
		{
			case 1:
				if(check1==1)
					System.out.println("Already added!");
				else
					price += getLettuce();
					check1 = 1;
				break;
			case 2:
				if(check2==1)
					System.out.println("Already added!");
				else
					price += getTomato();
					check2 = 1;
				break;
			case 3:
				if(check3==1)
					System.out.println("Already added!");
				else
					price += getCarrot();
					check3 = 1;
				break;
			case 4:
				if(check4==1)
					System.out.println("Already added!");
				else
					price += getCheese();
					check4 = 1;
				break;
			case 5:
				System.out.println("Processing...");
				break;
			case 6:
				if(check5==1)
					System.out.println("Already added!");
				else
					price += getSpinitch();
					check5 = 1;
				break;
			case 7:
				if(check6==1)
					System.out.println("Already added!");
				else
					price += getCucumber();
					check6 = 1;
				break;
		}
		if(c1==5)
		{
			break;
		}
		else
			System.out.println("Base Price : " + price + "Rs.");

		}while(c1 > 0 && c1 <= 7);
		System.out.println("--------------------------------------------");
		System.out.println("Final Price : " + price + "Rs.");
		System.out.println("--------------------------------------------");

		price = 0;
	}
	
	
}

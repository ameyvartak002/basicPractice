package OOPS_Excercise;

import java.awt.Choice;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				
		Basic b = new Basic();
		Healthy h = new Healthy();
		Deluxe d = new Deluxe();
		
		int choice;
		do
		{
			System.out.println("--------------------------------------------");
			System.out.println("Bills Burger");
			System.out.println("--------------------------------------------");
			System.out.println("Select your burger ! \n1.Basic Burger \n2.Healthy Burger \n3.Deluxe Burger");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					b.burgerType();
					break;
				case 2:
					h.burgerType();
					break;
				case 3:
					d.burgerType();
					break;
				default:
					System.out.println("Wrong choice ");
					break;
			}
		}while(choice != 0);
		

	}
}

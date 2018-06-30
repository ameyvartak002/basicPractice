/**
 * Developed by Amey Vartak
 * https://github.com/ameyvartak002
 */

package ArrayList;

import java.util.Scanner;

public class MobilePhone 
{
	Scanner sc = new Scanner(System.in);
	int choice;
	String name;
	long number;
	
	Contacts c = new Contacts();
	
	public void mobilePhone()
	{
		do {
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice : ");
			System.out.println("1.Add new contact \n2.Update contact \n3.Delete contact \n4.Search contact \n5.Display all contacts \n6.Quit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				name = nameInput();
				number = numberInput();
				c.addNewContact(name, number);
				break;
			case 2:
				name = nameInput();
				number = numberInput();
				c.updateContact(name, number);
				break;
			case 3:
				name = nameInput();
				number = numberInput();
				c.deleteContact(name, number);
				break;
			case 4:
				System.out.println("1.Enter name \t2.Enter Number");
				int cho = sc.nextInt();
				if(cho == 1)
				{
					name = nameInput();
					c.searchContact(name);
				}
				else
				{
					number = numberInput();
					c.searchContact(number);
				}
				break;
			case 5:
				c.displayContact();
				break;
			case 6:
				System.out.println("Exiting the application....");
				break;
			}

		}while(choice != 6);
	}
	
	public String nameInput()
	{
		System.out.print("Enter name = ");
		String n = sc.next();
		return n;
	}
	
	public long numberInput()
	{
		System.out.print("Enter number = ");
		long n = sc.nextLong();
		return n;
	}
}

/**
 * Developed by Amey Vartak
 * https://github.com/ameyvartak002
 */

package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts 
{
	private ArrayList<String> contactName = new ArrayList<String>();
	private ArrayList<Long> contactNumber = new ArrayList<Long>();
	private static int count = 0;
	private static int position;
	Scanner sc = new Scanner(System.in);
	
	public void displayContact()
	{
		if(contactName.size() ==0 )
		{
			System.out.println("No contacts found.");
		}
		else
		{
			for(int i=0; i<contactName.size(); i++)
			{
				System.out.println("Name = " + contactName.get(i) + " \tNumber = " + contactNumber.get(i));
			}
		}
	}
	
	public void addNewContact(String name, long number)
	{
		if(checkContacts(number, name) == false)
		{
			contactName.add(name);
			contactNumber.add(number);
			System.out.println("Contact successfully added.");
		}
		else
			System.out.println("Contact already available.");
	}
	
	public void updateContact(String name, long number)
	{
		if(checkContacts(number, name) == true)
		{
			int pos = checkContactLocation(name);
			System.out.println("Name = " + contactName.get(pos) + " \tNumber = " + contactNumber.get(pos));

			System.out.print("Enter new name and number = ");
			System.out.println();
			contactName.set(pos, sc.next());
			contactNumber.set(pos, sc.nextLong());
			System.out.println("Contact successfully updated.");
		}
		else
			System.out.println("Contact not available.");
	}
	
	public void deleteContact(String name, long number)
	{
		if(checkContacts(number, name) == true)
		{
			contactName.remove(name);
			contactNumber.remove(number);
			System.out.println("Contact successfully deleted.");
		}
		else
			System.out.println("Contact not available.");
	}
	
	public void searchContact(String name)
	{
		int pos = checkContactLocation(name);

		if(pos < 0)
		{
			System.out.println("Contact not found.");
		}
		else
			System.out.println("Name = " + contactName.get(pos) + " \tNumber = " + contactNumber.get(pos));
	}
	
	public void searchContact(long number)
	{
		int pos = checkContactLocation(number);

		if(pos < 0)
		{
			System.out.println("Contact not found.");
		}
		else
			System.out.println("Name = " + contactName.get(pos) + " \tNumber = " + contactNumber.get(pos));
	}
	
	private boolean checkContacts(long number, String name)
	{
		boolean check1 = contactName.contains(name);
		boolean check2 = contactNumber.contains(number);
		if(check1 == true || check2 == true)
			return true;
		else
			return false;
	}
	
	private int checkContactLocation(String name)
	{
		position = contactName.indexOf(name);
		return position;
	}
	
	private int checkContactLocation(long number)
	{
		position = contactName.indexOf(number);
		return position;
	}
	
}

package Classes;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//Bank Class
		/*{
			Bank b=new Bank();

			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter ID, Balance, Name, Email, Phone : ");
			int id=sc.nextInt();
			double bal=sc.nextDouble();
			String name=sc.next();
			String email=sc.next();
			int phone=sc.nextInt();
			
			b.setData(id, bal, name, email, phone);
			System.out.println("1.Withdraw \n2.Deposit");
			int choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter amount : ");
				int amount=sc.nextInt();
				
				double currentBalance=b.withdrawFunds(amount);
				System.out.println("Current balance : "+currentBalance+"Rs.");
			}
			else if(choice==2)
			{
				System.out.println("Enter amount : ");
				int amount=sc.nextInt();
				
				double currentBalance=b.depositFunds(amount);
				System.out.println("Current balance : "+currentBalance+"Rs.");
			}
			else
				System.out.println("Wrong choice!");
			
			sc.close();
		}*/
		
		//VipCustomer
		System.out.println("Constructor 1");
		VipCustomer v1=new VipCustomer();
		
		System.out.println("\nConstructor 2");
		VipCustomer v2=new VipCustomer("Amey","myemail.com");
		
		System.out.println("\nConstructor 3");
		VipCustomer v3=new VipCustomer("Vartak",1000,"vartak@gmail.com");
	}
}

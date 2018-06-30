import java.util.Scanner;

public class switchPrac 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any char value : ");
			char c=sc.next().charAt(0);
			
			String s="Amey";
			
			switch(c)
			{
				case 'A':case 'B':case 'C':case 'D':case 'E':
					System.out.println("Character is = "+c);
					break;
				
				default:
					System.out.println("Invalid input!");
					break;
			}
		}
	}
}

import java.util.Scanner;

public class Operators 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values : ");
		double d1=sc.nextDouble();
		double d2=sc.nextDouble();
		
		double R=((d1+d2)*25)%40;
		if(R<=20)
			System.out.println("Over Limit!");
		else
			System.out.println("Less than 20");
	}
}

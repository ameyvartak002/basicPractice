import java.util.Scanner;

public class LbsToKg 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total pounds : ");
		double lbs=sc.nextDouble();
		double kg=lbs*0.45359237d;
		System.out.println("Conerted to KG : "+kg);
	}
}

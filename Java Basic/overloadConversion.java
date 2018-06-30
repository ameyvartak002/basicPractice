import java.util.Scanner;

public class overloadConversion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Inches : ");
		double inch=sc.nextDouble();
		
		convertToCentimeters(inch);
	}
	
	public static double convertToCentimeters(double feet,double inch)
	{
		double res=0;
		if(feet>=0 && (inch>=0 && inch<=12))
		{
			res=(inch+(feet*12))*2.54d;
		}
		else
			return -1;
		return res;
	}
	
	public static double convertToCentimeters(double inch)
	{
		double feet=0,in=0;
		
		if(inch>=0)
		{
			feet=(int)inch/12;
			in=inch%12;
			double cent=convertToCentimeters(feet,in);
			if(cent>=0)
				System.out.println(feet+" feet & "+in+" inches = "+cent+"cm");
			else
				System.out.println("Invalid input!");
		}
		else
		{
			System.out.println("Invalid input");
			return -1;
		}
		return 0;
	}
}

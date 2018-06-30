import java.util.Scanner;

class atm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double y=sc.nextDouble();
		
		if(x%5==0)
		{
			if(x>y)
			{
				System.out.printf("%.2f",y);
			}
			else
			{
				double res=y-x-0.50;
				System.out.printf("%.2f",res);
			}
		}
		else
		{
			System.out.printf("%.2f",y);
		}
		sc.close();
	}
}

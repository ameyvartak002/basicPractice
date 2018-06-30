import java.util.Scanner;

public class forPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		while(true)
		{
			System.out.println("Enter maximum number : ");
			n=sc.nextInt();
			System.out.println("1");
			isPrime(n);
		}
	}
	
	public static void isPrime(int n)
	{
		int c=0;
		for(int i=2;i<=n;i++)
		{
			int cnt=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.println(i);
				c++;
			}
			//if(c==3)
				//break;
		}
	}
}

import java.util.Scanner;

public class xbonnaci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		int a=sc.nextInt();
		double b[]= {13};
		xbonnaci x=new xbonnaci();
		double temp[]=x.tribonacci(b, a);
		for(double q:temp)
		{
			System.out.println(q);
		}
	}

	public double[] tribonacci(double[] s, int n) 
	{
		double t[]=new double[n];
		for(int i=0;i<s.length;i++)
		{
			t[i]=s[i];
		}
		if(n>=3)
		{
			for(int i=3;i<n;i++)
			{
				t[i]=t[i-3]+t[i-2]+t[i-1];
			}
			return t;
		}
		else
			return t;
	}
}

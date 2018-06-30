import java.util.Scanner;

public class evenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter last number : ");
			int n=sc.nextInt();
			int cnt=10;
			int evenNumbersFound=0;
			do 
			{
				if(isEvenNumber(cnt))
				{
					evenNumbersFound++;
					System.out.println(cnt);
					if(evenNumbersFound==5)
						break;
				}
				//System.out.println("It is "+isEvenNumber(cnt)+"\t	that the number "+cnt+" is even number");
				cnt++;
			}while(n>=cnt);
		}	
	}
	
	public static boolean isEvenNumber(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}
}

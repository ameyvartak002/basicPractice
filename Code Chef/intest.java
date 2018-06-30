import java.util.Scanner;

class intest 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%k==0)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}

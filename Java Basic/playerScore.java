import java.util.Scanner;

public class playerScore 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player name : ");
		String pname=sc.next();
		System.out.println("Enter final score : ");
		int score=sc.nextInt();
		
		int pos=calculateHighScore(score);
		displayHighScore(pname,pos);
	}
	
	public static void displayHighScore(String name,int pos)
	{
		System.out.println(name + " managed to get position " + pos + " on the high score table.");
	}
	
	public static int calculateHighScore(int score)
	{
		if(score>=1000)
			return 1;
		else if(score>=500 && score<1000)
			return 2;
		else if(score>=100 && score<500)
			return 3;
		else
			return 4;
	}
}

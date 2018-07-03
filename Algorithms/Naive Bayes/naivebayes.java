import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class naivebayes 
{
	static double dy1,dy2 ,dy3,dy4,dn1,dn2,dn3,dn4;
	public static void main(String[] args) throws IOException
	{
		double YES=0, NO=0;
		double ay1[]=new double[10];
		double ay2[]=new double[10];
		double ay3[]=new double[10];
		double an1[]=new double[10];
		double an2[]=new double[10];
		double an3[]=new double[10];
		
		DecimalFormat df=new DecimalFormat(".####");
				
		BufferedReader br1=new BufferedReader(new FileReader("E://JAVA/age.txt"));
		String str1;
		List<Integer> list1=new ArrayList<Integer>();
		while((str1=br1.readLine())!=null)
		{
			int a=Integer.parseInt(str1);
			list1.add(a);
		}
		int[] strarr1=list1.stream().mapToInt(Integer::intValue).toArray();
		br1.close();

		BufferedReader br2=new BufferedReader(new FileReader("E://JAVA/income.txt"));
		String str2;
		List<String> list2=new ArrayList<String>();
		while((str2=br2.readLine())!=null)
		{
			list2.add(str2);
		}
		String[] strarr2=list2.toArray(new String[0]);
		br2.close();
		
		BufferedReader br3=new BufferedReader(new FileReader("E://JAVA/student.txt"));
		String str3;
		List<String> list3=new ArrayList<String>();
		while((str3=br3.readLine())!=null)
		{
			list3.add(str3);
		}
		String[] strarr3=list3.toArray(new String[0]);
		br3.close();
		
		BufferedReader br4=new BufferedReader(new FileReader("E://JAVA/credit.txt"));
		String str4;
		List<String> list4=new ArrayList<String>();
		while((str4=br4.readLine())!=null)
		{
			list4.add(str4);
		}
		String[] strarr4=list4.toArray(new String[0]);
		br4.close();
		
		BufferedReader br5=new BufferedReader(new FileReader("E://JAVA/computer.txt"));
		String str5;
		List<String> list5=new ArrayList<String>();
		while((str5=br5.readLine())!=null)
		{
			list5.add(str5);
		}
		String[] strarr5=list5.toArray(new String[0]);
		br5.close();
		
		for(int i=0;i<strarr5.length;i++)
		{
			if(strarr5[i].equals("Y"))
			{
				YES++;
			}
			else
			{
				NO++;
			}
		}
		
		//Frequency Table Calculations
		//Age
		for(int i=0;i<strarr1.length;i++)
		{
			if(strarr1[i]<=30)
			{
				if(strarr5[i].equals("Y"))
				{
					ay1[0]++;
				}
				else
					an1[0]++;
			}
			else if(strarr1[i]>30&&strarr1[i]<=40)
			{
				if(strarr5[i].equals("Y"))
				{
					ay2[0]++;
				}
				else
					an2[0]++;
			}
			else
			{
				if(strarr5[i].equals("Y"))
				{
					ay3[0]++;
				}
				else
					an3[0]++;
			}
		}

		//Income
		for(int i=0;i<strarr2.length;i++)
		{
			if(strarr2[i].equals("H"))
			{
				if(strarr5[i].equals("Y"))
				{
					ay1[1]++;
				}
				else
					an1[1]++;
			}
			else if(strarr2[i].equals("M"))
			{
				if(strarr5[i].equals("Y"))
				{
					ay2[1]++;
				}
				else
					an2[1]++;
			}
			else
			{
				if(strarr5[i].equals("Y"))
				{
					ay3[1]++;
				}
				else
					an3[1]++;
			}
		}

		//Student
		for(int i=0;i<strarr3.length;i++)
		{
			if(strarr3[i].equals("Y"))
			{
				if(strarr5[i].equals("Y"))
				{
					ay1[2]++;
				}
				else
					an1[2]++;
			}
			else
			{
				if(strarr5[i].equals("Y"))
				{
					ay2[2]++;
				}
				else
					an2[2]++;
			}
		}
		
		//Credit Rating
		for(int i=0;i<strarr4.length;i++)
		{
			if(strarr4[i].equals("E"))
			{
				if(strarr5[i].equals("Y"))
				{
					ay1[3]++;
				}
				else
					an1[3]++;
			}
			else
			{
				if(strarr5[i].equals("Y"))
				{
					ay2[3]++;
				}
				else
					an2[3]++;
			}
		}

		//Frequency Table 
		System.out.println("Age | Y : "+ay1[0]+" "+ay2[0]+" "+ay3[0]+" Age | N : "+an1[0]+" "+an2[0]+" "+an3[0]);
		System.out.println("Income | Y : "+ay1[1]+" "+ay2[1]+" "+ay3[1]+" Income | N : "+an1[1]+" "+an2[1]+" "+an3[1]);
		System.out.println("Student | Y : "+ay1[2]+" "+ay2[2]+" Student | N : "+an1[2]+" "+an2[2]);
		System.out.println("Credit Rating | Y : "+ay1[3]+" "+ay2[3]+" Credit Rating | N : "+an1[3]+" "+an2[3]);

		Scanner sc=new Scanner(System.in);
		System.out.println("Select Input : \nAge===> ");
		System.out.println("1: <30 \n2: 30..40 \n3: >40");
		int c1=sc.nextInt();
		switch(c1)
		{
			case 1:
				dy1=ay1[0]/YES;
				dn1=an1[0]/NO;
				break;
			case 2:
				dy1=ay2[0]/YES;
				dn1=an2[0]/NO;
				break;
			case 3:
				dy1=ay3[0]/YES;
				dn1=an3[0]/NO;
				break;
			default:
				System.exit(0);
		}
		System.out.println("Income===> ");
		System.out.println("1: High \n2: Medium \n3. Low");
		int c2=sc.nextInt();
		switch(c2)
		{
			case 1:
				dy2=ay1[1]/YES;
				dn2=an1[1]/NO;
				break;
			case 2:
				dy2=ay2[1]/YES;
				dn2=an2[1]/NO;
				break;
			case 3:
				dy2=ay3[1]/YES;
				dn2=an3[1]/NO;
				break;
			default:
				System.exit(0);
		}
		System.out.println("Student===> ");
		System.out.println("1: Yes \n2: No");
		int c3=sc.nextInt();
		switch(c3)
		{
			case 1:
				dy3=ay1[2]/YES;
				dn3=an1[2]/NO;
				break;
			case 2:
				dy3=ay2[2]/YES;
				dn3=an2[2]/NO;
				break;
			default:
				System.exit(0);
		}
		System.out.println("Credit Rating===> ");
		System.out.println("1: Excellent \n2: Fair");
		int c4=sc.nextInt();
		switch(c4)
		{
			case 1:
				dy4=ay1[3]/YES;
				dn4=an1[3]/NO;
				break;
			case 2:
				dy4=ay2[3]/YES;
				dn4=an2[3]/NO;
				break;
			default:
				System.exit(0);
		}
		double res1=dy1*dy2*dy3*dy4*(YES/(YES+NO));
		double res2=dn1*dn2*dn3*dn4*(NO/(YES+NO));
		
		System.out.println("Probability Of YES : "+df.format(res1)+"\nProbability Of NO :  "+df.format(res2));
		if(res1<res2)
		{
			System.out.println("Customer Wont Buy A Computer!");
		}
		else
			System.out.println("Customer Will Buy A Computer!");
		
		/*System.out.print(Arrays.toString(strarr1));
		System.out.println();
		System.out.print(Arrays.toString(strarr2));
		System.out.println();
		System.out.print(Arrays.toString(strarr3));
		System.out.println();
		System.out.print(Arrays.toString(strarr4));
		System.out.println();
		System.out.print(Arrays.toString(strarr5));
		System.out.println("YES : "+YES+" NO : "+NO);*/
		
	}
}

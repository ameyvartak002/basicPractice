import java.util.Scanner;

class chefchr
{
	static int a=0;
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        String str = "chef";
        int n = str.length();
    	int T=sc.nextInt();
        String s[]=new String[T];

    	for(int x=0;x<T;x++)
    	{
    		s[x]=sc.next();
    	}
    	
        chefchr ch = new chefchr();
        for(int x=0;x<T;x++)
    	{
        	a=0;
            int res=ch.logic(str, 0, n-1,s[x]);
            if(res==0)
            	System.out.println("normal");
            else
                System.out.println("lovely "+res);
    	}
    }
    private int logic(String str, int l, int r,String s1)
    {
        	if (l == r)
            {
            	if(s1.contains(str))	
            	{
            		a++;
            	}
            }
            else
            {
                for (int i1 = l; i1 <= r; i1++)
                {
                    str = swap(str,l,i1);
                    logic(str, l+1, r,s1);
                    str = swap(str,l,i1);
                }
            }
           return a;
        }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}
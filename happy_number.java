import java.util.*;
class happy
{
    public static int sq(int n)
    {
        int s=0,r;
        while(true)
		  {
				while (n>0)
        		{
            	r=n%10;
            	s=s+r*r;
            	n=n/10;
        		}
				if(s<10)
				{
					break;
				}
				n=s;
				s=0;
			}
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0;
        n=sc.nextInt();
        a=sq(n);
       if(a==1 || a==7)
       {
            System.out.println("True");
       }
       else
       {
            System.out.println("False");
       }
        
    }
}
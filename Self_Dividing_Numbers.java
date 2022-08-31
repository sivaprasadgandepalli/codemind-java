import java.util.*;
class selfdevidingnmbr
{
	public static boolean sdn(int n)
	  {	
		int c=0,r,l,s;
		s=n;
		l=(int)Math.log10(s)+1;
	     while(n>0)
		  {
			r=n%10;
			if(r>0)
			 {
			  if(s%r==0)
			    {
				c+=1;
			    }
			 }
			n=n/10;
		   }
		if(c==l)
		   {
			return true;
		    }
		else
			{
			return false;
			}
	   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
	    for(int i=a;i<=b;i++)
		{
			if(sdn(i))
			{
				System.out.print(i+" ");
			}
			
		}
    }
} 
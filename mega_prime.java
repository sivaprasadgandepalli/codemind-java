import java.util.*;
class megaprime
{
    public static boolean isprime(int n)
    {
        if (n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean mp(int n)
    {
        int r,l,c=0;
        l=(int)Math.log10(n)+1;
        for(int i=1;i<=l;i++)
        {
             r=n%10;
             if(r>0)
             {
                 if(isprime(r))
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
        int n,l;
        n=sc.nextInt();
		l=(int)Math.log10(n)+1;
        if(isprime(n)&& mp(n))
        {
		   System.out.println("Mega Prime");

        }
       else
       {
            System.out.println("Not Mega Prime");
        }
       
    }
}
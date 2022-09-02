import java.util.*;
class circularPrime
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0,s;
        n=sc.nextInt();
        s=n;
        while (n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(isprime(s))
        {
            if(isprime(sum))
            {
                System.out.println("circular prime");
            }
            else
            {
                 System.out.println("prime but not a circular prime");
            }
        }
        else
        {
            System.out.println("not prime");
        }
       
    }
}
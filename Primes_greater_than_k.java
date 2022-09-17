import java.util.*;
class primesgrtthank
{
    public static boolean isprime(int n)
    {
        int c=0;
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
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
        int n,k,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(isprime(x[j]))
            {
                if(x[j]>=k)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
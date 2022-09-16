import java.util.*;
class primgrt
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(isprime(x[j]))
            {
				
                c++;
            }
        }
        System.out.println(c);
    }
}
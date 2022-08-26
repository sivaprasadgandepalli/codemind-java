import java.util.*;
class pm
{
    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                c+=1;
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
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if (isprime(i))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}
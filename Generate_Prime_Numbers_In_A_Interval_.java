import java.util.*;
class prm
{
    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
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
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1)
        {
            a+=1;
        }
        for(int i=a;i<=b;i++)
        {
          if(isprime(i))
          {
              System.out.println(i);
          }
        }
    }
}
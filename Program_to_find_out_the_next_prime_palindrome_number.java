import java.util.*;
class prmpal
{
    
    public static boolean ispal(int n)
    {
        int s=0,r,org;
        org=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(org==s)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
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
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(int i=n;;i++)
       {
           if(isprime(i)&&ispal(i))
           {
               if(i!=n)
               {
                   System.out.println(i);
                   break;
               }
           }
       }
    }
}
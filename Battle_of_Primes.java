import java.util.*;
class bp
{
    public static boolean isprime(int x)
    {
       int count=0;
       for(int i=2;i<=x/2;i++)
       {
           if(x%i==0)
           {
               count+=1;
           }
       }
       if(count==0)
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
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        for(int i=1;i<=c;i++)
        {
            if(isprime(c+i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}
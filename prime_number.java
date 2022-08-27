import java.util.*;
class ch
{
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
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        if(a<2)
        {
            System.out.println("not a prime");
        }
        else
        {
            if(isprime(a))
            {
               System.out.println("prime"); 
            }
            else
            {
                System.out.println("not a prime");
            }
        }
        
    }
}
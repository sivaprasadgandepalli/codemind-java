import java.util.*;
class bp
{
    public static int fact(int n)
    {
       int f=1;
       for(int i=1;i<=n;i++)
       {
           f*=i;
       }
       return f;
    }
    public static void main(String args[])
    {
        int n,l,r,s=0,p=1,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n;
        l=(int)Math.log10(n)+1;
        for(int i=1;i<=l;i++)
        {
            r=n%10;
            n=n/10;
            s+=fact(r);
           
        }
        if(s==t)
        {
            System.out.println("The number " +t+ " is a strong number");
        }
        else
        {
            System.out.println("The number "+t+" is not a strong number");
        }
    }
}
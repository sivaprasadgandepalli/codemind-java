import java.util.*;
class pal
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
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(ispal(i))
            {
                System.out.print(i+" ");
            }
        }
        
    }
}
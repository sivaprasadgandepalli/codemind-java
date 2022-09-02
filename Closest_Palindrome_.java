import java.util.*;
class closepal
{
    public static boolean ispal(int n)
    {
        int r,s=0,l,org;
        org=n;
        l=(int)Math.log10(n)+1;
        for(int i=1;i<=l;i++)
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
    public static int afterp(int n)
    {
        int c;
        for(int i=n;;i++)
        {
            if(ispal(i) && i!=n)
            {
                c=i;
                break;
            }
        }
        return c;
    }
    public static int beforep(int n)
    {
        int c;
        for(int i=n;;i--)
        {
            if(ispal(i) && i!=n)
            {
                c=i;
                break;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,p1,p2,d1,d2;
        n=sc.nextInt();
        p1=beforep(n);
        p2=afterp(n);
        d1=n-p1;
        d2=p2-n;
        if(d1>d2)
        {
            System.out.println(p2);
        }
        else if(d1==d2)
        {
            System.out.println(p1+" "+p2);
        }
        else
        {
            System.out.println(p1); 
        }
    }
}
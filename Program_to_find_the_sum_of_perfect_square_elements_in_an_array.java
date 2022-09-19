import java.util.*;
class sumofper
{
    public static boolean isperf(int n)
    {
        double d=Math.sqrt(n);
        if((d-(int)d)>0)
        {
            return false;
        }
        else
        {
            return true;
        }
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
        for(int i=0;i<n;i++)
        {
            if(isperf(x[i]))
            {
                c+=x[i];
            }
        }
        System.out.println(c);
    }
}
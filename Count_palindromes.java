import java.util.*;
class div
{
    public static boolean ispal(int n)
    {
        int r,s=0;
        int org=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==org)
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
        int n,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(ispal(x[j]))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
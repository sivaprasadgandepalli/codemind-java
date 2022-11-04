import java.util.*;
class reverse
{
    public static int rev(int n)
    {
        int s=0,r;
        while (n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            x[i]=rev(x[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}
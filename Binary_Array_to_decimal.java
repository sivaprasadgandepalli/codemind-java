import java.util.*;
class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]==0)
            {
                continue;
            }
            else
            {
                s=s+(int)Math.pow(2,n-1-i);
            }
        }
        System.out.println(s);
    }
}
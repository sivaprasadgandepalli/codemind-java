import java.util.*;
class maxofarr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,mx=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(x[j]>x[k])
                {
                   mx=x[j];
                   x[j]=x[k];
                   x[k]=mx;
                }
            }
        }
        System.out.println(x[n-1]);
    }
}
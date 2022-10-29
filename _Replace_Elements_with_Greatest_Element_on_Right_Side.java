import java.util.*;
class replace
{
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
        for(int i=0;i<n-1;i++)
        {
            int mx=0;
            for(int j=i+1;j<n;j++)
            {
                if(x[j]>mx)
                {
                    mx=x[j];
                }
            }
            x[i]=mx;
        }
        x[n-1]=-1;
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}
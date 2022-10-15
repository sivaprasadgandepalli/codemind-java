import java.util.*;
class duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=1;
        n=sc.nextInt();
        int x[]=new int[n];
        int z[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
            {
                if(x[i]!=x[j])
                {
                    s=s*x[j];
                }
            }
            z[i]=s;
            s=1;
        }
         for(int i=0;i<n;i++)
        {
            System.out.print(z[i]+" ");
        }
    }
}
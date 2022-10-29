import java.util.*;
class smthancn
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
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(x[j]==x[i])
                {
                    c++;
                }
            }
            if(c==1 && x[i]>mx)
            {
                mx=x[i];
            }
        }
        if(mx==0)
        {
            System.out.print(-1);
        }
        else
        {
            System.out.print(mx);
        }
    }
}
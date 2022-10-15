import java.util.*;
class duplicate
{
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
            for(int j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                {
                    c++;
                }
            }
            if(c!=0)
            {
                System.out.println(x[i]);
                break;
            }
        }
    }
}
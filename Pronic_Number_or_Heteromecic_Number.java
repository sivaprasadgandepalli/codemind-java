import java.util.*;
class pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,c=0;
        n=sc.nextInt();
        sq=(int)Math.sqrt(n);
        for(int i=1;i<=sq+1;i++)
        {
            for(int j=1;j<=sq+1;j++)
            {
                if(i*j==n && i!=j)
                {
                    c=1;
                    break;
                }
            }
        }
        if(c==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
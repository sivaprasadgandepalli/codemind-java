import java.util.*;
class div
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(x[j]%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
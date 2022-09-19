import java.util.*;
class sum
{
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum+=x[i];
        }
        System.out.println(sum);
    }
}
import java.util.*;
class uniqueodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,c=0,k;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            sum+=x[i];
        }
        System.out.println(sum);
    }
}
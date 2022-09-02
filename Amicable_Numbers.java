import java.util.*;
class amc
{
    public static int factsum(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum1,sum2;
        a=sc.nextInt();
        b=sc.nextInt();
        sum1=factsum(a);
        sum2=factsum(b);
        if(sum1==b && sum2==a)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}
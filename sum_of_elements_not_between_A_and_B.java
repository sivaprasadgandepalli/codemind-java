import java.util.*;
class elementsearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,a,b,sum=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(x[j]<a || x[j]>b)
            {
                sum+=x[j];
                c++;
            }
        }
        System.out.println(sum);
        
    }
}
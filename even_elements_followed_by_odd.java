import java.util.*;
class evenodd
{
    public static void main(String args[])
    {
        int n,m=0,l=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        int even[]=new int[n];
         int odd[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
               even[m]=x[i];
               m++;
            }
            else
            {
                odd[l]=x[i];
                l++;
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(even[i]+" ");
        }
        for(int j=0;j<l;j++)
        {
            System.out.print(odd[j]+" ");
        }
    }
}
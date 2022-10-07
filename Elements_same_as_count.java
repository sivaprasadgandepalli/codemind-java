import java.util.*;
class elmsmascnt
{
    public static int count(int n,int arr[])
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k=0,s;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            s=count(x[j],x);
            if(x[j]==s)
            {
                System.out.print(x[j]+" ");
                x[j]=-99+j;
                k++;
            }
        }
       if(k==0)
       {
            System.out.println(-1);
       }
        
    }
}
import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,l=0;
        n=sc.nextInt();
        l=n-1;
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]==0)
            {
                y[s]=0;
                s++;
                
            }
            else
            {
               y[l]=1;
               l--;
            }
        }
        for(int j=0;j<y.length;j++)
        {
            System.out.print(y[j]+" ");
        }
    }
}
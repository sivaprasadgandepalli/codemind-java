import java.util.*;
class smalleronleft
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0,k=0;
            if(i!=0)
            {
                for(int j=i-1;j>-1;j--)
                {
                    k++;
                    if(x[j]<x[i])
                    {
                        System.out.print(x[j]+" ");
                        break;
                    }
                    else
                    {
                        c++;
                    }
                }
                if(c==k)
                {
                    System.out.print("-1"+" ");
                }
            }
            else
            {
                System.out.print("-1"+" ");
            }
        }
    }
}
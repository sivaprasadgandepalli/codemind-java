import java.util.*;
class smthancn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,mx=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           int l=(int)(Math.log10(x[i]))+1;
           if(l%2==0)
           {
               mx++;
           }
           
        }
        System.out.println(mx);
       
    }
}
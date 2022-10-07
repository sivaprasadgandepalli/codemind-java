import java.util.*;
class countofelem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
       for(int i=1;i<n-1;i++)
       {
           if(x[i-1]%2==0 &&x[i+1]%2==0)
           {
               if(x[i]%2==0)
               {
                   c++;
               }
           }
       }
       System.out.println(c);
    }
}
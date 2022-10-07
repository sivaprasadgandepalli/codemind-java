import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,s=0,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            
            if(x[i]<a||x[i]>b)
            {
                System.out.print(x[i]+" ");
                s+=1;
            }
        }
        if(s==0)
        {
            System.out.println(-1);
        }
    }
}
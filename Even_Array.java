import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,avg,k=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=1;i<n;i++)
        {
            x[i]=sc.nextInt();
            s+=x[i];
        }
        avg=Math.floorDiv(s,n);
        for(int j=0;j<n;j++)
        {
            if(x[j]%2==0)
            {
                k++;
            }
        }
        if(k==n)
        {
            System.out.println("True");
        }
        else
        {
           System.out.println("False"); 
        }
        
    }
}
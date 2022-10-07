import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,avg,k=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            s+=x[i];
        }
        avg=s/n;
        for(int j=0;j<n;j++)
        {
            if(x[j]<=avg)
            {
                k++;
            }
        }
        System.out.println(k);
        
    }
}
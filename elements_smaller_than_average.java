import java.util.*;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,count=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
            s+=arr[j];
        }
        int avg=s/n+1;
        for(int k=0;k<n;k++)
        {
            if(arr[k]<avg)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
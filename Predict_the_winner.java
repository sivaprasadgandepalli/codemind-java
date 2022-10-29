import java.util.*;
class winner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,es=0,os=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(i%2==0)
            {
                es+=x[i];
            }
            else
            {
                os+=x[i];
            }
        }
        if(Math.abs(es-os)%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}
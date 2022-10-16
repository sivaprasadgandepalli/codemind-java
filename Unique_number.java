import java.util.*;
class unique
{
    public static int count(int n,int y)
    {
        int c=0,r;
        while (n>0)
        {
            r=n%10;
            if(r==y)
            {
                c++;
            }
            n=n/10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k=0,org,l,r;
        n=sc.nextInt();
        org=n;
        l=(int)Math.log10(n)+1;
        for(int i=1;i<=l;i++)
        {
            r=n%10;
            if(count(org,r)==1)
            {
				  
                k++;
            }
            n=n/10;
        }
        if(k==l)
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}
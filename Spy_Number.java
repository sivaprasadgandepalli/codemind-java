import java.util.*;
class bp
{
    public static void main(String args[])
    {
        int n,l,r,s=0,p=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=(int)Math.log10(n)+1;
        for(int i=1;i<=l;i++)
        {
            r=n%10;
            n=n/10;
            s+=r;
            p*=r;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}
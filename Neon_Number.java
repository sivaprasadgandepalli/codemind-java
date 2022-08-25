import java.util.*;
class bp
{
    public static void main(String args[])
    {
        int n,l,r,s=0,sq;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        l=(int)Math.log10(sq)+1;
        for(int i=1;i<=l;i++)
        {
            
            r=sq%10;
            sq=sq/10;
            s+=r;
        }
        if(s==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}
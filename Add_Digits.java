import java.util.*;
class prm
{
    public static int sum(int n)
    {
        int c=0,r,l;
        l=(int)Math.log10(n)+1;
        for(int i=1;i<=l;i++)
        {
            r=n%10;
            n=n/10;
            c+=r;
        }
       return c;
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sum(a);
        int i=1;
        while(b>10)
        {
           b=sum(b);
           i++;
        }
       System.out.println(b); 
    }
}
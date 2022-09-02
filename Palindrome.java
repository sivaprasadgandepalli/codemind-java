import java.util.*;
class p
{
    public static int rev(int n)
    {
        int s=0,r;
        while (n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        int n,s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=rev(n);
        if(s==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False"); 
        }
    }
}
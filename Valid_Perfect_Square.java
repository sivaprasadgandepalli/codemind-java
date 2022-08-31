import java.util.*;
class vps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a,s;
        double sq,d;
        t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            a=sc.nextInt();
            sq=Math.sqrt(a);
            s=(int)Math.sqrt(a);
            d=Math.abs(sq-s);
            if(d>0)
            {
                System.out.println("False");
            }
            else
            {
                System.out.println("True");
            }
        }
    }
}
import java.util.*;
class smallfac
{
    public static int fact(int n)
    { int prd=1;
        for(int i=1;i<=n;i++)
        {
            prd*=i;
        }
        return prd;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T,a;
        T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            a=sc.nextInt();
            System.out.println(fact(a));
        }
    }
}
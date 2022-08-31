import java.util.*;
class pretty
{
    public static boolean ispretty(int n)
    {
        int r;
        
        r=n%10;
        if(r==2||r==3||r==9)
        {
            return true;
        }
        return false;
   
    }
    public static int count(int x,int y)
    {
        int c=0,r;
        for(int i=x;i<=y;i++)
        {
            if(ispretty(i))
            {
                c+=1;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        int T,a,b;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(count(a,b));
        }
    }
}
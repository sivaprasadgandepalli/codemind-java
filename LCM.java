import java.util.*;
class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,mx,mn;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            mx=a;
            mn=b;
        }
        else
        {
            mx=b;
            mn=a;
        }
        for(int i=1;;i++)
        {
            if(mx*i%mn==0)
            {
                System.out.println(mx*i);
                break;
            }
        }
    }
}
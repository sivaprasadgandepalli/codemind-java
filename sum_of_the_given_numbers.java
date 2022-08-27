import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,t,s;
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            s=a+b;
            System.out.println(s);
            t--;
        }
    }
}
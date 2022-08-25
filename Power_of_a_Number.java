import java.util.*;
class sq
{
    public static void main(String args[])
    {
        int x,y,m,p,mod;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        p=(int)Math.pow(x,y);
        mod=p%m;
        System.out.println(mod);
    }
}
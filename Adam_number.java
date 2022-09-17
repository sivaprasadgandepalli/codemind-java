import java.util.*;
class adam_nmber
{
    public static int revs(int n)
    {
        int s=0,r;
        int org=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
    public static boolean isadam(int n)
    {
        int sq1,sq2;
        sq1=(int)Math.pow(n,2);
        sq2=(int)Math.pow(revs(n),2);
        if(sq1==revs(sq2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isadam(n))
        {
            System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
    }
}
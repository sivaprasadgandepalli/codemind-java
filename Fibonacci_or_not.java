import java.util.*;
class fibnacciOrNot
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=a+b;
        int i=1;
        while(c<=n)
        {
            c=a+b;
            if(c==n)
            {
                count=1;
                break;
            }
            a=b;
            b=c;
            i++;
        }
        if(count==1)
        {
            System.out.println("True");
        }
        else
        {
           System.out.println("False");  
        }
    }
}
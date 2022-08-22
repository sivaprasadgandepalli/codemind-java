import java.util.*;
class phn
{
    public static void main(String args[])
    {
        int len;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char ch=s.charAt(0);
        len=s.length();
        if(len==10&&ch!='0')
        {
            System.out.println("Valid");
        }
        else
        {
             System.out.println("Invalid");
        }
    }
}
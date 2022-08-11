import java.util.*;
class posorneg
{
    public static void main(String args[])
    {
        int nmbr;
        Scanner sc=new Scanner(System.in);
        nmbr=sc.nextInt();
        if (nmbr>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}
import java.util.*;
class GOD{
    public static void main(String args[])
    {
        int hf,sf,spf;
        Scanner sc=new Scanner(System.in);
        hf=sc.nextInt();
        sf=sc.nextInt();
        spf=sc.nextInt();
        if (hf>50&&sf>60&&spf>100)
        {
            System.out.println("10");
        }
        else if(hf>50&&sf>60)
        {
            System.out.println("9");
        }
        else if(sf>60&&spf>100)
        {
            System.out.println("8");
        }
        else if(hf>50&&spf>100)
        {
           System.out.println("7"); 
        }
        else if(hf>50||sf>60||spf>100)
        {
             System.out.println("6");
        }
        else
        {
             System.out.println("5");
        }
    }
}
import java.util.*;
class Eb{
    public static void main(String args[])
    {
        int units;
        double bill=0.0;
        String id,name;
        Scanner sc=new Scanner(System.in);
        id=sc.nextLine();
        name=sc.nextLine();
        units=sc.nextInt();
        if(units<200)
        {
            bill=units*1.20f;
        }
        else if(units>200 && units<400)
        {
            bill=units*1.50f;
        }
        else if(units>400 && units<600)
        {
            bill=units*1.80f;
        }
        else if(units>=600)
        {
            bill=units*2.00f;
        }
        if (bill>400)
        {
            bill=bill+bill*0.15f;
            System.out.printf("%.2f",bill);
        }
        else
        {
            bill=bill+100;
            System.out.printf("%.2f",bill);
        }
    }
}
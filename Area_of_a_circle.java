import java.util.*;
class area{
    public static void main(String args[])
    {
        int r;
        double a,pi=3.14;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        a=(pi*r*r);
        System.out.printf("%.2f",a);
    }
}
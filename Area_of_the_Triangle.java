import java.util.*;
class Area{
    public static void main(String args[])
    {
        double a,b,c,s,sq,A;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        sq=s*(s-a)*(s-b)*(s-c);
        A=Math.sqrt(sq);
        System.out.printf("%.2f",A);
    }
}
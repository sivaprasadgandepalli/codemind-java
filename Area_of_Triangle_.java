import java.util.*;
class tr{
    public static void main(String args[])
    {
        int a,b,c;
        float s,ar;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        ar=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
    }
}
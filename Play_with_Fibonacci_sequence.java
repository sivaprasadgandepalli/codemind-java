import java.util.Scanner;
class fibnacci
{
 public static void main(String args[])
 {
  int a=0,b=1,n,c;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  System.out.printf(a+" "+b+" ");
  int i=1;
  while(i<=n-2)
  {
    c=a+b;
    System.out.printf(c+" ");
    a=b;
    b=c;
    i++;  
  }
 }
}
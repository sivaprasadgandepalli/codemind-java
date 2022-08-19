import java.util.*;
class Perfectsqrt
{
 public static void main(String args[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  double d=Math.sqrt(n);
  if((d-(int)d)>0)
     { 
    System.out.println("False");
      }
  else
      {
      System.out.println("True");
       }
  }

}
import java.util.*;
class automorphic
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,sq,r,l,d;
  n=sc.nextInt();
  sq=n*n;
  l=((int)Math.log10(n))+1;
  d=(int)Math.pow(10,l);
  r=sq%d;
  if(r==n)
  {
   System.out.println("Automorphic Number");
   }
  else
   {
   System.out.println("Not an Automorphic Number");
   }
 }

}
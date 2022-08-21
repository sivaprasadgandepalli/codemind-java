import java.util.*;
class table
{
 public static void main(String args[])
 {
  
  Scanner sc=new Scanner(System.in); 
  int n,d,d1,d2,length;
  n=sc.nextInt();
  d=sc.nextInt();
  length=(int)Math.log10(n)+1;
  d1=n/(int)Math.pow(10,length-d);
  d2=n%(int)Math.pow(10,d);
  System.out.println(Math.abs(d1-d2));
  sc.close();
  
 }


}
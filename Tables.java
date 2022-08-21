import java.util.*;
class table
{
 public static void main(String args[])
 {
  
  Scanner sc=new Scanner(System.in); 
  int i,r,t;
  t=sc.nextInt();
  r=sc.nextInt();
  for(i=1;i<=r;i=i+1)
     {
         if(i%2!=0)
         {
              System.out.println(t+" x "+i+" = "+t*i);
         }
     }
  sc.close();
 }


}
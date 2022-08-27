import java.util.*;
class maxdigit
{
 public static void main(String args[])
 {  
  	Scanner sc=new Scanner(System.in);
  	int n,r,md=0;
  	n=sc.nextInt();
	while(n>0)
	{
	 r=n%10;
	 if(r>md)
	  { 
		md=r;
	  }
	 n=n/10;
	} 
   System.out.println(md);
  }
}
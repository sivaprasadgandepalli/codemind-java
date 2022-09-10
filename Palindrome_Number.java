import java.util.*;
class revInt
{
 public static boolean rev(int n)
 {
 	int s=0,r,org;
 	org=n;
	while(n>0)
	{
		r=n%10;
		s=s*10+r;
		n=n/10;
	}
	if(s==org)
	{
	    return true;
	}
	else
	{
	    return false;
	}
 }
 public static void main(String args[])
 {
  	Scanner sc=new Scanner(System.in);
  	int n,a;
  	n=sc.nextInt();
  	for(int i=1;i<=n;i++)
  	{
  	    a=sc.nextInt();
  	    if(rev(a))
  	    {
  	        System.out.println("True");
  	    }
  	    else
  	    {
  	        System.out.println("False");
  	    }
  	}
	
 }
}
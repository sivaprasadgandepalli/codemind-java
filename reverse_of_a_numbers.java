import java.util.*;
class revInt
{
 public static int rev(int n)
 {
 	int s=0,r;
	while(n>0)
	{
		r=n%10;
		s=s*10+r;
		n=n/10;
	}
	return s;
 }
 public static void main(String args[])
 {
  	Scanner sc=new Scanner(System.in);
  	int n,c,res;
  	n=sc.nextInt();
	if(n<0)
	{
	  c=0-n;
       res=rev(c);
       res=0-res;
       System.out.println(res);
	}
  	else
     {
	  System.out.println(rev(n));
	}
 }
}
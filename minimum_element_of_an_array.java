import java.util.*;
class elementsgrtavg
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int n,s=9999;
	n=sc.nextInt();
	int x[]=new int[n];
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
		
		if(x[i]<s)
		{
		    s=x[i];
		}
	}
	System.out.println(s);
	
 }
}
import java.util.*;
class elementsgrtavg
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int n,s;
	n=sc.nextInt();
	int x[]=new int[n];
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
	}
	s=sc.nextInt();
	int k=0;
	for(int i=0;i<n;i++)
	{
	    if(s==x[i])
	    {
	        k++;
	    }
	}
	if(k>0)
	{
	    	System.out.println("True");
	}
	else
	{
	    	System.out.println("False");
	}
 }
}
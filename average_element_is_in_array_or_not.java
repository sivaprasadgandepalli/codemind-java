import java.util.*;
class elementsgrtavg
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int n,s=0;
	n=sc.nextInt();
	int x[]=new int[n];
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
		s+=x[i];
	}
	int avg=s/n;
	int k=0;
	for(int i=0;i<n;i++)
	{
	    if(avg==x[i])
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
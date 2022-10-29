import java.util.*;
class homework
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int n,mx=0;
	n=sc.nextInt();
	int x[]=new int[n];
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	    int c=0;
		for(int j=0;j<n;j++)
	    {
	        if(x[i]==x[j])
	        {
	            c++;
	        }
	    }
	    if(c>n/2)
	    {
	        if(x[i]>mx)
	        {
	            mx=x[i];
	        }
	    }
	}
	System.out.println(mx);
 }
}
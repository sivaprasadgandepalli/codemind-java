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
	int k=0;
	for(int j=0;j<n;j++)
	{
	    if(x[j]%2!=0)
	    {
	        k=x[j];
	    }
	}
	System.out.println(k);
 }
}
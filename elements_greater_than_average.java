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
	int avg=Math.floorDiv(s,n);
	int k=0;
	for(int j=0;j<n;j++)
	{
	    if(x[j]>=avg)
	    {
	        k++;
	    }
	}
	System.out.println(k);
 }
}
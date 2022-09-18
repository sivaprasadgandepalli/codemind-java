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
	float avg=(float)s/n;
	System.out.format("%.2f",avg);
	
 }
}
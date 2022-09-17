import java.util.*;
class elementsab
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
   int n,k,l,c=0;
	n=sc.nextInt();
	int x[]=new int[n];
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
	}
	k=sc.nextInt();
	l=sc.nextInt();
	for(int j=0;j<n;j++)
	{
		if(x[j]>=k && x[j]<=l)
		{
			c=c+x[j];
		}
	}
	if(c!=0)
	{
		System.out.println(c);
	}
	else
	{
		System.out.println(-1);
	}
    
  }
}
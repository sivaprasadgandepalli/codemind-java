import java.util.*;
class homework
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int n,m,c=0;
	n=sc.nextInt();
	int x[]=new int[n];
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
	}
	m=sc.nextInt();
	int y[]=new int[m];
	for(int i=0;i<n;i++)
	{
		y[i]=sc.nextInt();
	}
	int q=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(q>=x[i]&&q<=y[i])
		{
			if(y[i]>=q)
			{
				c++;
			}
		}
	}
	System.out.println(c);

 }
}
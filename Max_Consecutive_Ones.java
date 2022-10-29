import java.util.*;
class maxones
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0,n,mx=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				c++;
			}
			else
			{
				if(c>mx)
				{
					mx=c;
				}
				c=0;
			}
		}
		System.out.println(Math.max(mx,c));
	}
}
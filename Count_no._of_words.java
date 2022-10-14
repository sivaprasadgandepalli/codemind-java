import java.util.*;
class number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n;
		int w=0;
		n=sc.nextLine();
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)==' '&&n.charAt(i+1)!=' '){
				w++;
			}
			
		}
		if(n.length()==0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println((w+1));
		}
	}
}
import java.util.*;
class occurance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n;
		int w=0;
		n=sc.nextLine();
		char c;
		c=sc.next().charAt(0);
		for(int i=0;i<n.length();i++)
		{
		    char ch=n.charAt(i);
			if(ch==c){
			    w++;
			}
			
		}
		if(w!=0)
		{
		    System.out.println(w);
		}
	    else
	    {
	        System.out.println(-1);
	    }
	}
}
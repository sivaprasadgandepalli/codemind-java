import java.util.*;
class occurance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n;
		int w=0;
		n=sc.nextLine();
		for(int i=0;i<n.length();i++)
		{
		    char ch=n.charAt(i);
			if(Character.isDigit(ch)){
			    w++;
			}
			
		}
		if(w!=0)
		{
		    System.out.println("Contains "+w+" digit");
		}
		else
		{
		    System.out.println("Doesn't contain digit");
		}
	}
}
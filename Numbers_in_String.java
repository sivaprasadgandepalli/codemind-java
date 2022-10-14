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
		    char ch=n.charAt(i);
			if(ch>=48 && ch<=57){
				w=w+Character.getNumericValue(ch);
			}
			
		}
		System.out.println(w);
	
	}
}
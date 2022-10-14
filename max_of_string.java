import java.util.*;
class number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n;
		int w=0;
		String word="";
		n=sc.nextLine();
		for(int i=0;i<n.length();i++)
		{
		    char ch=n.charAt(i);
			if(Character.isAlphabetic(ch)){
			    if(Character.getNumericValue(ch)>w)
			    {
			        w=Character.getNumericValue(ch);
			        word=ch+"";
			    }
			}
			
		}
		System.out.println(word);
	
	}
}
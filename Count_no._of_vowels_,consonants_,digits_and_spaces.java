import java.util.*;
class equalString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int v=0,c=0,D=0,S=0;
		String vowels="AEIOUaeiou";
		String n;
		n=sc.nextLine();
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(vowels.contains(ch+"")){
				v++;
			}
			else if(ch>=48&&ch<=57){
				D++;
			}
			else if(ch==' '){
				S++;
			}
			else{
				c++;
			}
		}
		System.out.println("Vowels: "+v);
		System.out.println("Consonants: "+c);
		System.out.println("Digits: "+D);
		System.out.println("White spaces: "+S);
	}
}
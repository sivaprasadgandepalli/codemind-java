import java.util.*;
class gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,hcf=0;
        a=sc.nextInt();
		  
        b=sc.nextInt();
        for(int i=1;i<=a||i<=b;i++)
        {
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
        }
		System.out.println(hcf);
        
      
        
    }
}
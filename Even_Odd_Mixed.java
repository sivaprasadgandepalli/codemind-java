import java.util.*;
class mixed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,e=0,o=0,m=0,l;
        n=sc.nextInt();
        l=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            
            if(r%2==0)
                {
                    e++;
                }
            else if(r%2!=0)
                {
                    o++;
                }
				
            n=n/10;
        }
        if(e==l)
            {
                System.out.println("Even");
            }
        else if(o==l)
            {
                System.out.println("Odd");
            }
        else 
            {
                System.out.println("Mixed");
            }
        
        
    }
}
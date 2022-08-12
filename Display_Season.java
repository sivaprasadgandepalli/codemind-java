import java.util.*;
class season
{
    public static void main(String args[])
    {
        int mn;
        Scanner sc=new Scanner(System.in);
        mn=sc.nextInt();
        if(mn==4 || mn==5 || mn==6)
        {
            System.out.println("Summer");
        }
        else if(mn==7||mn==8||mn==9||mn==10||mn==11)
        {
            System.out.println("Rainy");
        }
        else if(mn==11||mn==12||mn==1)
        {
            System.out.println("Winter");
        }
        else if(mn==2||mn==3)
        {
            System.out.println("Spring");
        }
        else
        {
          System.out.println("-1");  
        }
    }
}
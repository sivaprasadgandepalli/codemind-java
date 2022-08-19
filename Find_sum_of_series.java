import java.util.Scanner;
class SNN
{
 public static void main(String args[])
 {
  int n;
  double sum=0.0;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
      sum=sum+(1/(float)i);
  }
 System.out.printf("%.2f",sum);
  }
}
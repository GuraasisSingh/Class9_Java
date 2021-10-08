//input 5 input numbers and print their average
import java.util.*;
public class For_Loop12
{
    public static void For_Loop12()
    {
       double avg=0.0d;
       int s=0,t=0;
       Scanner sc = new Scanner(System.in);
       for(int x=1;x<=5;x++)
       {
           System.out.println("Enter a number");
           int a=sc.nextInt();
           s+=a;
           t++;
       }
      avg=(double)s/t;
      System.out.println("Average of five numbers is: "+avg);
    }
}

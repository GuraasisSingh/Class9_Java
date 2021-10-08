//input 5 numbers and print sum of all numbers
import java.util.*;
public class For_Loop9
{
    public static void For_Loop9()
    {
       int sum=0;
       Scanner sc = new Scanner(System.in);
       for(int i=1;i<=5;i++)
       {
           System.out.println("Enter a number");
           int n=sc.nextInt();
           sum+=n;
        }
        System.out.println("The sum of 5 numbers is = "+sum);
        
    }
}

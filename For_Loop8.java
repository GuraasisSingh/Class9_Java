//input five numbers and print all odd numbers
import java.util.*;
public class For_Loop8
{
    public static void For_Loop8()
    {
       for(int i=1;i<=5;i++)
       {
           System.out.println("Enter a number");
           Scanner sc = new Scanner(System.in);
           int n=sc.nextInt();
           if(n%2!=0)
           System.out.println("odd number entered is "+n);
        }
    }
}

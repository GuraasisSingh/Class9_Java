
//input a number and print all numbers till that numbers
import java.util.*;
public class For_Loop11
{
    public static void For_Loop11()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n=sc.nextInt();
       System.out.println("Numbers till "+n+" are: ");
       for(int x =1; x<=n;x++)
       System.out.println(x);
    }
}

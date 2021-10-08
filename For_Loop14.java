//input a number and find its factorial
import java.util.*;
public class For_Loop14
{
   public static void For_Loop14()
    {
       int f=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=sc.nextInt();
       for(int x=1;x<=n;x++)
       f=f*x;
       System.out.println("The factorial of "+n+" ="+ f);
    }

}

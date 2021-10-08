//print fibonacci series upto n terms
import java.util.*;
public class For_Loop15
{
    public static void For_Loop15()
    {
        int a =0, b=1;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter till what number do you want the fibonacci series");
        int n=sc.nextInt();
        System.out.println("Fibonacci series upto"+n +"terms are");
        System.out.println(a);
        System.out.println(b);
        for(int x=1; x<=(n-2);x++)
        {
          int c=a+b;
          a=b;
          b=c;
          System.out.println(c);
        }
    }
}

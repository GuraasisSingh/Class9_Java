
//input 5 numbers and print each number the number of times as itself
import java.util.*;
public class Nested_For1
{
    public static void Nested_For1()
    {
       int a,x,y;
       Scanner sc=new Scanner(System.in);
       for(x=1;x<=5;x++)
       {
           System.out.println("Enter a number");
           a=sc.nextInt();
           System.out.println("Entered number is");
           for(y=1;y<=a;y++)
           System.out.println(a);
        }
    }
}

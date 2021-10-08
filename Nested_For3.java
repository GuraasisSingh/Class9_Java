//input 5 numbers and print factors of each
import java.util.*;
public class Nested_For3
{
    public static void Nested_For3()
    {
        int a, b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for(x=1;x<=5;x++)
        {
          a=sc.nextInt();
          System.out.println("Factors of"+ a + "are");
          for(b=1;b<=a;b++)
          {
            if(a%b==0)
            System.out.println(b);
           }
        }
    }
}

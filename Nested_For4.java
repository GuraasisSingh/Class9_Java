import java.util.*;
public class Nested_For4
{
   public static void For_Loop_Nested()
    {
       Scanner sc=new Scanner(System.in);
       for(int y=1;y<=5;y++)
       {
          int f=1;
          System.out.println("Enter number"+y);
          int n=sc.nextInt();
          System.out.println("The factorial of "+n+" is");
           for(int x=1;x<=n;x++)
            f=f*x;
            System.out.println(f);
       }
    }

}
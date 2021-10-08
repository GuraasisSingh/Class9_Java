//input 5 numbers and print average of factors of each number
import java.util.*;
public class Nested_For5
{
    public static void Nested_Loop5()
    {
       Scanner sc=new Scanner(System.in);
       for(int x=1; x<=5;x++)
       {
           System.out.println("Enter number"+x);
           int a=sc.nextInt();
           int s=0,t=0;
           System.out.println("The factors of "+a+ "are");
           for(int y=1;y<=a;y++)
           {
             if(a%y==0)
             {
                 s+=y;
                 t++;
                 System.out.println(y);
              }
             }
           double avg =(double)s/t;
           System.out.println("The average = "+avg);
        }
    }
}


//input five numbers and count the total number of odd numbers
import java.util.*;
public class For_Loop10
{
    public static void For_Loop10()
    {
      int count=0;
      Scanner sc = new Scanner(System.in);
      for(int i=1;i<=5;i++)
      {
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%2!=0)
        count++;
       } 
      System.out.println("The total numbers of odd numbers are "+count); 
    }
}
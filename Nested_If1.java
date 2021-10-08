import java.util.*;
public class Nested_If1
{
   static int lockdown, essential;
   static void movement()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter lockdown number");
       lockdown=sc.nextInt();
       System.out.println(" \" Enter 1 if you're essential worker\" ");
       essential=sc.nextInt();
          if(lockdown>0)
       {
           if (essential==1)
           System.out.println("You can go out");
           else
           System.out.println("You cannot go out");
       }
          else
        {
            System.out.println("Everyone can go out");
        }
    }
}      

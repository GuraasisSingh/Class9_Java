//if choice is 1, input two numbers and checkwhether its factor of another number or not and if choice is 2, print first five factors of number
import java.util.*;
public class For_Switch
{
    public static void For_Switch()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to input two numbers and checkif its a factor or not and enter 2 to print first five factors of the number");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter two numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a%b==0)
            System.out.println( b+"is a factor of "+a);
            else
            System.out.println(b+" is not a factor of "+a);
            break;
            case 2:
            int c=0;
            System.out.println("Enter a number");
            int d=sc.nextInt();
            System.out.println("First Five Factors of "+d+" are ");
            for(int e =1;e<=d;e++)
            {
                if(d%e==0)
                {
                    System.out.println(e);
                    c++;
                    if(c==5)
                    break;
                }
            }
            break;
        }
    }

}

//input a few numbers and print the table of all odd numbers of size 5 and loop should stop if the user enters number divisible by 5.
import java.util.*;
class While_Looping3
{
    static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        while(n%5!=0)
        {
            if(n%2==1)
            {
                for(int x=1;x<=5;x++)
                
                 System.out.println(n+"*"+x+"="+(n*x));
                System.out.println("Enter a number not divisible by 5 to continue");
                n=sc.nextInt();
            }
        }
        
    }
}
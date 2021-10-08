//input few numbers and print the product of the numbers less than or equal to 5 and the sum of numbers greater than five.the loop should stop if the user enters an odd number
import java.util.*;
class While_Looping4
{
    static void main()
    {
        int p=1,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        while(n%2!=1)
        {
            if(n<=5)
            p*=n;
            else
            s+=n;
            System.out.println("Enter a number that is even to continue");
            n=sc.nextInt();
        }
        System.out.println("Product = "+p);
        System.out.println("Sum="+s);
    }
}
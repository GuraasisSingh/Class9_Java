// input a few numbers and  print how many numers has the user entered.the loop should stop if the user enters a 0
import java.util.*;
class While_Looping1
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c =0;
        while(n!=0)
        {
            c++;
            System.out.println("Enter a number than 0 to continue");
            n=sc.nextInt();
        }
        System.out.println("Numbers entered are "+c);
    }
}

import java.util.*;
class While_Loop4
{
    static void main()
    {
        int x=1,c=0;
        while(x<=5)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number"+x);
           int n=sc.nextInt();
            if(n%5==0 && n%2==0)
            {
               c++;
               System.out.println(n+" is divisible by 5 and even ");
            }
            x++;
        }
        System.out.println("Numbers are"+c);
    }
}
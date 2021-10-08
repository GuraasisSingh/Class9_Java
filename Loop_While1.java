// Extracting digits
import java.util.*;
class Loop_While1
{
    static void main()
    {
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        while(n!=0)
        {
            c=n%10;
            System.out.println("Digit is "+c);
            n/=10;
        }
    }
}
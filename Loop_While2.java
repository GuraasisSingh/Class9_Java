//Reverse number
import java.util.*;
class Loop_While2
{
    static void main()
    {
        int c,r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        while(n!=0)
        {
            c=n%10;
            r=r*10+c;
            n/=10;
        }
        System.out.println("The reversed number = "+r);
    }
}
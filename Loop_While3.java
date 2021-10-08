// Buzz number: ends with 7, sum of digit is 7 or divisible by 7
import java.util.*;
class Loop_While3
{
    static void main()
    {
        int m,s=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            c=n%10;
            s+=c;
            n/=10;
        }
        if(s==7||m%7==0||m%10==7)
        System.out.println(m+" is a Buzz number");
        else
        System.out.println(m+" is not a buzz number");
    }
}
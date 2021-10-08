//palindrome
import java.util.*;
class Loop_While4
{
    static void main()
    {
        int n,m,r=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            c=n%10;
            r=r*10+c;
            n/=10;
        }
        if(r==m)
        System.out.println(m+" is a palindrome number");
        else
        System.out.println(m+" is not a palindrome number");
    }
}
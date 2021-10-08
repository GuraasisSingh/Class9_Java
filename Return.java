import java.util.*;
class Return
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,n1=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        n1=n*n;
        int a=reverse(n);
        int b=reverse(n1);
        if(a==n && b==n1)
        System.out.println("Super Palindrome");
        else
         System.out.println("Not Super Palindrome");
    }
    static int reverse(int m)
    {
        int s=0,c;
        while(m>0)
        {
            c=m%10;
            s=(s*10)+c;
            m/=10;
        }
        return s;
    }
}
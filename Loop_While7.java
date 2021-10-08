// Armstrong number
import java.util.*;
class Loop_While7
{
    static void main()
    {
        int c=0,a,m,n;
        double s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        n=m;
        while(n!=0)
        {
            a= n%10;
            s+=Math.pow(a,c);
            n/=10;
        }
        if(m==s)
        System.out.println(m+" is an armstrong");
        else
        System.out.println(m+" is not an armstrong");
    }
}
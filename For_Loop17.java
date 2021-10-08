//print tribonacci series upto n terms
import java.util.*;
class For_Loop17
{
    static void main ()
    {
        int a=0, b=1, c=2, d, x, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=sc.nextInt();
        System.out.println("Tribonacci series upto "+ n+" terms is");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for(x=1; x<=(n-3); x++)
        {
            d= a+b+c;
            a=b;
            b=c;
            c=d;
            System.out.println(d);
        }
    }
}

//input a number and check whether its prime or not
import java.util.*;
public class For_Loop16
{
    public static void For_Loop16()
    {
        int t=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            if(n%x==0)
            t++;
        }
        if(t==2)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number"); 
    }

}

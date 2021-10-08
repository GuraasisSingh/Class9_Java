//Duck number
import java.util.*;
class Loop_While5
{
    static void main()
    {
        int n,m,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            c=n%10;
            if(c==0)
            break;
            n/=10;
        }
        if(c==0) 
         System.out.println(m+" is a duck number");
            else
         System.out.println(m+" is not a duck number");
        
    }
}
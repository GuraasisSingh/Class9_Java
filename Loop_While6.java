//Automorphic Number: whose square ends in the number itself
import java.util.*;
class Loop_While6
{
    static void main()
    {
        double s=0,m,p;
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        m=n;
        double sq=n*n;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        p=sq% Math.pow(10,count);
        System.out.println("value after extracting remainder fron square is "+p);
        if(p==m)
        System.out.println(m+" is an automorphic number");
        else
        System.out.println(m+" is not an automorphic number");
    }
}
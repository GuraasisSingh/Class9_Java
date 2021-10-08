// input a number and find its factors
import java.util.*;
class For_Loop13
{
    static void main()
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        System.out.println("Factors of"+ a + "are");
        for(b=1;b<=a;b++)
        {
            if(a%b==0)
            System.out.print(b+",");
        }
    }
}
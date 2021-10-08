//input a few numbers and print sum of even numbers. the loop should stop if the user enters 99
import java.io.*;
class While_Looping2
{
    static void main()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n= Integer.parseInt(br.readLine());
        int s=0;
        while(n!=99)
        {
            if(n%2==0)
            {
              s+=n;
              System.out.println("Enter a number other than 99 to continue");
              n=Integer.parseInt(br.readLine());
            }
            System.out.println("Sum of even numbers = "+s);
        }
    }
}
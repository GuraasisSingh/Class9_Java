//special two digit number:sum of digits+product of digits=number
import java.io.*;
class Loop_While8
{
    static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int first,last,p,sum;
        if(n<10 || n>99)
        System.out.println("Invalid Number");
        else
        {
           first=n/10;
           last=n%10;
           sum= first+last;
           p=first*last;
           if((sum+p)==n)
           System.out.println(n+" is a speacial two digit number");
           else
           System.out.println(n+" is not a special two digit number");
        }
    }
}

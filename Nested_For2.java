//prime numbers betwwen 1 to 50
public class Nested_For2
{
    public static void For_Loop16()
    {
        int t;
        System.out.println("Prime numbers between 1 to 50 are");
        for(int x=1;x<=50;x++)
        {
          t=0;
          for(int b=1;b<=x;b++)
        {
            if(x%b==0)
            t++;
         }
        if(t==2)
        System.out.println(x);
        }
    }

}
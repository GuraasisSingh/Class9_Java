
// 1/1! + 2/2! 3/3! +......n/n!
public class Sum_Series5
{
     public static void Sum_Of_Series1(int n)
    {
        float s=0,f;
        for(int x=1;x<=n;x++)
        {     f=1;
             for(int y=1;y<=x;y++)
              f*=y;
             s=s+(x/f);
        }
        System.out.println("Sum of series = "+s);
    }
}

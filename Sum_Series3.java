
/* 1! + 2! + 3! .....n!
 */
public class Sum_Series3
{   public static void Sum_Of_Series1(int n)
    {
        int s=0,f;
        for(int x=1;x<=n;x++)
        {   f=1;
            for(int y=1; y<=x;y++)
            {
                f=f*y;
            }
            s=s+f;
        }
        System.out.println("Sum of series = "+s);
    }
}

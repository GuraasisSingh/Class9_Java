
/**
 * 1+2+3+4+5...n
 */
public class Sum_Series1
{
    public static void Sum_Of_Series1(int n)
    {
        int s=0;
        for(int x=1;x<=n;x++)
        {
            s=s+x;
        }
        System.out.println("Sum of series = "+s);
    }
}

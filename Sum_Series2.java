
/* 1/2 + 2/3 + 3/4 + 4/5 + 5/6....n/n+1
 * 
 */
public class Sum_Series2
{
       public static void Sum_Of_Series1(int n)
    {
        float s=0;
        for(int x=1;x<=n;x++)
        {
            s=s+(x/(x+1));
        }
        System.out.println("Sum of series = "+s);
    }
}

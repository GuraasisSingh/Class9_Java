
// (1*2) + (2*3) + (3*4) +......n terms
public class Sum_Series7
{
    public static void Sum_Of_Series1(int n)
    {
        int s=0;
        for(int x=1;x<=n;x++)
        {
           s+=x*(x+1);
        }
        System.out.println("Sum of series = "+s);
    }
}

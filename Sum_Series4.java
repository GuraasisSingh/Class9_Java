
//1+4+9+16.....n terms
public class Sum_Series4
{
   public static void Sum_Of_Series1(int n)
    {
        int s=0,p=1;
        for(int x=1;x<=n;x++)
        {
            p=x*x;
            s=s+p;
        }
        System.out.println("Sum of series = "+s);
    }
}

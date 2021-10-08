
//2/3-4/5+6/7-8/9+......n terms
public class Sum_Series6
{
     public static void Sum_Of_Series1(int n)
    {
        double s=0.0d,p;
        for(int x=2;x<=n;x++)
        {  
           p= x/(x+1);
           s=(x%2==0)? s+p: s-p;
        }
        System.out.println("Sum of series = "+s);
    }
}

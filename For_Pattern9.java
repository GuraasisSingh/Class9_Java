
/* 5 4 3 2 1 
 * 5 4 3 2
 * 5 4 3 
 * 5 4 
 * 5
 */
public class For_Pattern9
{
    public static void main()
    {
       for(int x=1;x<=5;x++)
        {
           for(int y=5;y>=x;y--)
             System.out.print(y+" ");
           System.out.println(); 
        }
    }
}

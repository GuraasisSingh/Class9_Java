/* 1 2 3 4 5
 * 2 3 4 5
 * 3 4 5
 * 4 5
 * 5
 */
public class For_Pattern1
{
    public static void For_Pattern1()
    {
        for(int x=1;x<=5;x++)
        {
           for(int y=x;y<=5;y++)
             System.out.print(y+" ");
           System.out.println(); 
        }
    }
}

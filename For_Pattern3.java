/* 5 4 3 2 1
 * 4 3 2 1 
 * 3 2 1 
 * 2 1
 * 1
 */
public class For_Pattern3
{
    public static void For_Pattern1()
    {
        for(int x=5;x>=1;x--)
        {
           for(int y=x;y>=1;y--)
             System.out.print(y+" ");
           System.out.println(); 
        }
    }
}
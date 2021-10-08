/* 5 
 * 5 4
 * 5 4 3
 * 5 4 3 2
 * 5 4 3 2 1
 */
public class For_Pattern7
{
    public static void For_Pattern1()
    {
        for(int x=5;x>=1;x--)
        {
           for(int y=5;y>=x;y--)
             System.out.print(y+" ");
           System.out.println(); 
        }
    }
}
/* 0
 * 0 1
 * 0 1 2
 * 0 1 2 3
 * 0 1 2 3 4
 */
public class For_Pattern2
{
    public static void For_Pattern1()
    {
        for(int x=0;x<5;x++)
        {
           for(int y=0;y<=x;y++)
             System.out.print(y+" ");
           System.out.println(); 
        }
    }
}
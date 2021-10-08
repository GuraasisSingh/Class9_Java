/* 1 2 3 4 5 
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */
public class For_Pattern12
{
    public static void main()
    {
       for(int x=5;x>=1;x--)
        {
           for(int y=1;y<=x;y++)
             System.out.print(y+" ");
           System.out.println(); 
        }
    }
}
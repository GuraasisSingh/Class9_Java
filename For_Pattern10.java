
/* 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
public class For_Pattern10
{
    public static void main()
    {
       for(int x=1;x<=5;x++)
        {
           for(int y=1;y<=x;y++)
             System.out.print(x+" ");
           System.out.println(); 
        }
    }
}
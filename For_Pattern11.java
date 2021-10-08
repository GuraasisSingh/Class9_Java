/* 1
 * 2 3
 * 3 4 5
 * 4 5 6 7
 * 5 6 7 8 9
 */
public class For_Pattern11
{
    public static void main()
    {  int t;
       for(int x=1;x<=5;x++)
        {
           for(int y=0;y<=x-1;y++)
            { 
                t=x+y;
                System.out.print(t+" ");
            }
           System.out.println(); 
        }
    }
}
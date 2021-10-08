/* 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class For_Pattern5
{
    public static void For_Pattern1()
    {   
        int k=1;
        for(int x=1;x<5;x++)
        {
           for(int y=1;y<=x;y++)
             {
                 System.out.print(k+" ");
                 k++;
             }
           System.out.println(); 
        }
    }
}
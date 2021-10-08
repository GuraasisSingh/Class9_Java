
/*
 * 1
 *   1
 *     1
 *       1
 *         1
 */
public class Trap_Pattern3
{
    public static void Trap_Pattern3()
    {
        for(int x=1; x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
              if(x==y)
              System.out.print("1 ");
              else
              System.out.print(" ");
            }
            System.out.println();
        }
    }
}

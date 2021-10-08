
/* @           @
 *   @       @
 *     @   @
 *       @
 */
public class Trap_Pattern6
{
    public static void Trap_Pattern6()
    {
        for(int x=1;x<=4;x++)
        {
            for(int y=1;y<=7;y++)
            {
                if(x+y==8 || x==y)
                System.out.print("@ ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}


/*             *
 *           *   *
 *          *     *
 *         *       * 
 *          *     * 
 *           *   *
 *             *
 */
public class Trap_Pattern7
{
    public static void Trap_Pattern7()
    {
       for(int x=1; x<=7;x++)
       {
           for(int y=1; y<=7;y++)
           {
               if((x+y==5)||(x+y==11)||(y-x==3)||(x-y==3))
               System.out.print("* ");
               else
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}

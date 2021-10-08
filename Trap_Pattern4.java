
/* 1
 * 3 1
 * 1 3 1
 * 3 1 3 1
 * 1 3 1 3 1
 */
public class Trap_Pattern4
{
    public static void Trap_Pattern4()
    {
       for(int x=1;x<=5;x++)
       {
           for(int y=1;y<=x;y++)
           {
               if((x%2==1 && y%2==0)|| x%2==0 && y%2==1)
               System.out.print("3 ");
               else
               System.out.print("1 ");
            }
            System.out.println();
        }
    }
}


/*
 *  +
 *  * +
 *  + + +
 *  * + * +
 *  + + + + +
 */
public class Trap_Pattern2
{
    public static void Trap_Pattern2()
    {
        for(int x=1; x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                if(y%2==1 && x%2==0)
                System.out.print("* ");
                else
                System.out.print("+ ");
            }
            System.out.println();
        }
        
    }
}

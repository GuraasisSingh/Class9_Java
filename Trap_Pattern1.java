
/*
 * 1
 * 3 3
 * 1 1 1
 * 3 3 3 3
 * 1 1 1 1 1
 */
public class Trap_Pattern1
{
    public static void Location_Patterns()
    {
      for(int x=1;x<=5;x++)
      {
          for(int y=1;y<=x;y++)
          {
              if(x%2==0)
              System.out.print("3");
              else
              System.out.print("1");
            }
            System.out.println();
        }
    }
}

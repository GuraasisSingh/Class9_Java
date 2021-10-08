
import java.util.*;
class Nested_For6
{
    void main()
    { int x, t, y ,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n= sc.nextInt();
         for(x=1; x<=n; x++)
         {
          for(y=1; y<=10; y++)
          {
              t=x*y;
              System.out.println(x+"*"+y+"="+t);
            }
            }
        }
}
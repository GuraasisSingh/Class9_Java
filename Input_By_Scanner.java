import java.util.*;
public class Input_By_Scanner
{
    public static void Input_By_Scanner()
    {
        int n;
        String name;
        char c;
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter a name");
        name =sc.nextLine();
        System.out.println("Enter a character");
        c=sc.next().charAt(0);
        System.out.println("Enter a decimal");
        d=sc.nextFloat();
    }
}

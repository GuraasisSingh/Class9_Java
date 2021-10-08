import java.util.*;
public class Switch_case3
{
    public static void Switch_case3()
    {
     double ans=0.0d;
     final double pie=(double)22/7;
     int ch;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 1 for circumference,  2 for area and 3 for diameter of circle");
     ch=sc.nextInt();
     System.out.println("Enter radius");
     double r=sc.nextDouble();
     switch(ch)
     {
       case 1:
       ans= 2*r*pie;
       System.out.println("Circumference of circle = "+ans);
       break;
       case 2:
       ans= pie*r*r;
       System.out.println("Area of Circle = "+ans);
       break;
       case 3:
       ans=2*r;
       System.out.println("Diameter of Circle = "+ans);
       break;
       default:
       System.out.println("Enter a valid number");
      }
     }
}
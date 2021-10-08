public class Ternay_Operator
{
   public static void main()
   {
       int a=5,b=7 ;
       int x=a>=b ? a : a+2;
       System.out.println("Value of x is "+x);
       String s=(a==b)?" Identical":" Non Identical";
       System.out.println("value of string s is"+s);
       System.out.println((b>a)?b+" is greater":a +" is greater");
    }
}
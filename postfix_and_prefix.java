
public class postfix_and_prefix
{    
       public static void postfix_and_prefix()
    {
        int a=6;
       System.out.println(a++);
       System.out.println(++a);
       System.out.println(a--);
       System.out.println(--a);
    }
    static void accept()
    {
        int a=0,c=0;
        int b=a++;
        System.out.println(a);
        System.out.println(b);
        int d=++c;
        System.out.println(c);
        System.out.println(d);
    }
    static void main()
    {
        int m=4;
        System.out.println(m++);
        System.out.println(++m);
        System.out.println(m++);
        System.out.println(m++);
    }
}

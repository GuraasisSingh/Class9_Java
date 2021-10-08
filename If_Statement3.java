import java.util.*;
class If_Statement3
{
    public void input()
    {
        int p;
        double d=0.0d;
        double amt;
        double total;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter price");
        p=sc.nextInt();
        if(p>=10000)
        d= 0.5;
        else if (p>=7000)
        d= 0.3;
        else if (p>=5000)
         d= 0.2;
        else if (p>=2000)
         d= 0.1;
        else if(p<2000)
         d=0;
        amt= p*d;
        total=p-amt;
        System.out.println("Price is"+p);
        System.out.println("Discount is"+d);
        System.out.println("Amount paid after Discount is"+ total);
    }
}

import java.util.*;
class If_Else_If1
{
    public static void fine()
    {
        float fine;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        int d= sc.nextInt();
        if(d<=5)
        fine=d*0;
        else if (d<=10)
        fine= 5*0 +(d-5)*1;
        else if(d<=15)
        fine= 5*0 + 5*1 +(d-10)*2;
        else 
        fine= 5*0 + 5*1 + 5*2 +(d-15)*5;
        System.out.println("Fine ="+fine);
    }
}

import java.io.*;
class Methods
{
    int bno, phno,days,charge;
    String name;
    void input() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name, bike number, phone number and number of days required");
        name=br.readLine();
        bno=Integer.parseInt(br.readLine());
        phno=Integer.parseInt(br.readLine());
        days=Integer.parseInt(br.readLine());
    }
    void compute()
    {
        if(days<=5)
        charge= 500*days;
        else if(days<=10)
        charge= 500*5  + 400*(days-5);
        else
        charge= 500*5  + 400*5 +(days-10)*200;
    }
    void display()
    {
        System.out.println("Bike No \t Phone no \t Name  \t Days\t Charges");
        System.out.println(bno+" \t"+phno+" \t"+name+" \t"+days+" \t"+charge);
    }
    void main()throws IOException
    {
        Methods f= new Methods();
        f.input();
        f.compute();
        f.display();
    }
}
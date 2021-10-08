import java.io.*;
class If_Else_If2
{
    static void program()throws IOException
    {
        String t, p;
        float km=0.0f, bill=0.0f;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        String name=br.readLine();
        System.out.println("Enter number of kilometers");
        km=Float.parseFloat(br.readLine());
        if(km<=1)
        bill= km*25;
        else if(km<=6)
        bill= 1*25 +(km-1)*10;
        else if(km<=12)
        bill= 1*25 + 5*10 +(km-6)*15;
        else if(km<=18)
        bill= 1*25 + 5*10 + 6*15 +(km-12)*20;
        else
        bill= 1*25 + 5*10 + 6*15 + 6*20 +(km-18)*25;
       System.out.println("Bill="+bill);
    }
}
        
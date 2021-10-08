import java.io.*;
class If_Statement1
{
    public void main()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Enter a number");
        int n= Integer.parseInt(br.readLine());
        if(n%2==0)
        System.out.println(n +" is an even number");
        else
        System.out.println (n +"is an odd number");
       
    }
}
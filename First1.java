import java.io.*;
class First1
{
    public void main()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Enter a number");
        int n= Integer.parseInt(br.readLine());
        System.out.println ("The number entered is "+ n);
       
    }
}
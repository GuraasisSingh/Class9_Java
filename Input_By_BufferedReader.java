import java.io.*;
public class Input_By_BufferedReader
{
    public static void Input_By_BufferedReader()throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter name");
       String name= br.readLine();
       System.out.println("Enter number");
       int n = Integer.parseInt(br.readLine());
       System.out.println("Enter decimal");
       float d= Float.parseFloat(br.readLine());
       System.out.println("Enter character");
       char c= (char)br.read();
    }
}

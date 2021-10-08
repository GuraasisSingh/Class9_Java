import java.io.*;
public class Switch_case2
{
    public static void Switch_case()throws IOException
    {
        char grade;
        BufferedReader bc= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter grade");
        grade=(char)bc.read();
        switch(grade)
        {
            case 'A':
            System.out.println("Bahaut Vadiya, par top kisne kita");
            break;
            case 'B':
            case 'C':
            System.out.println("Theek theek hai, Zyada Khush na ho");
            break;
            case 'D':
            System.out.println("Bass massa massa pass hoya hai");
            break;
            case 'F':
            System.out.println("Keha si na padh le velleya, hun ghar chal");
            break;
            default:
            System.out.println("Grade taan sahi pa de");            
        }
        System.out.println("Your Grade is "+grade);
    }
}

import java.util.Scanner;
public class Switch_case1
{
    public static void Switch_case()
    {
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade");
        grade= sc.next().charAt(0);
        switch(grade)
        {
            case 'A':
            System.out.println("Excellent!");
            break;
            case 'B':
            case 'C':
            System.out.println("Theek theek hai, Zyada Khush na ho");
            break;
            case 'D':
            System.out.println("Bass massa massa pass hoya hai");
            case 'F':
            System.out.println("Keha si na padh le velleya, hun ghar chal");
            break;
            default:
            System.out.println("Grade taan sahi pa de");            
        }
        System.out.println("Your Grade is "+grade);
    }
}

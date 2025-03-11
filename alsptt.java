import java.util.Scanner;
public class alsptt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Character");
        char a = n.next().charAt(0);
        if((a>='a'&&a<='z'))
        {System.out.println("It is a Lowercase Alphabet");}
        else if(a>='A'&&a<='Z')
        {System.out.println("It is an Uppercase Alphabet");}
        else if(a>='1'&&a<='9')
        {System.out.println("It is a number");}
        else
        {System.out.println("It is a special character");}
        n.close();
    }
}
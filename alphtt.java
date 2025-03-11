import java.util.Scanner;
public class alphtt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Character");
        char a = n.next().charAt(0);
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
        {System.out.println("It is an Alphabet");}
        else
        {System.out.println("It is not an Alphabet");}
        n.close();
    }
}
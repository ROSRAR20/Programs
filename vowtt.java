import java.util.Scanner;
public class vowtt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Character");
        char a = n.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {System.out.println("Vowel");}
        else
        {System.out.println("Consonant");}
        n.close();
    }
}
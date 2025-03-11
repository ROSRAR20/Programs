import java.util.Scanner;
public class gnumtt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = n.nextInt();
        System.out.println("Enter the second number");
        int b = n.nextInt();
        if(a>b)
        {System.out.println(a+" is greater than "+b);}
        else
        {System.out.println(b+" is greater than "+a);}
        n.close();
    }
}
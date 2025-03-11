import java.util.Scanner;
public class sdetritt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the sides of a triangle");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("It is valid");
        }
        else
        {
            System.out.println("It is invalid");
        }
    }
}
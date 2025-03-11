import java.util.Scanner;
public class angtritt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the angles of a triangle");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        if(a+b+c==180)
        {
            System.out.println("It is valid");
        }
        else
        {
            System.out.println("It is invalid");
        }
    }
}
import java.util.Scanner;
public class esitritt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the sides of a triangle");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        if(a==b&&a==c)
        {
            System.out.println("It is Equilateral triangle");
        }
        else if(a==b||b==c||a==c)
        {
            System.out.println("It is isosceles triangle");
        }
        else
        {
            System.out.println("It is scalene triangle");
        }
    }
}
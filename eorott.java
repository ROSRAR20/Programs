import java.util.Scanner;
public class eorott
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = n.nextInt();
        if(a%2==0)
        {System.out.println(a+" is even");}
        else
        {System.out.println(a+" is odd");}
        n.close();
    }
}
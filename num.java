import java.util.Scanner;
public class num
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = n.nextInt();
        if(a>0)
        {System.out.println("Positive");}
        else if(a<0)
        {System.out.println("Negative");}
        else
        {System.out.println("Zero");}
        n.close();
    }
}
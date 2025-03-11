import java.util.Scanner;
public class num511
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = n.nextInt();
        if(a%5==0&&a%11==0)
        {System.out.println(a+" is divisible by 5 and 11");}
        else
        {System.out.println(a+" is not divisible by 5 and 11");}
        n.close();
    }
}
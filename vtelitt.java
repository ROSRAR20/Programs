import java.util.Scanner;
public class vtelitt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = n.nextInt();
        if(a>=18)
        {System.out.println("Eligible");}
        else
        {System.out.println("Not Eligible, You can be eligible once you are 18");}
        n.close();
    }
}
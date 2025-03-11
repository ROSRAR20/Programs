import java.util.Scanner;
public class cklytt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a year");
        int a = n.nextInt();
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                {
                    System.out.println("Leap year");
                }
                else
                {
                    System.out.println("Not a Leap year");
                }
            }
            else
            {
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
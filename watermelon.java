import java.util.Scanner;
public class watermelon
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        
        int a=n.nextInt();
        if(a%2==0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
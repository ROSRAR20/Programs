import java.util.Scanner;
public class g3numtt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        if(a>b&&a>c)
        {System.out.println(a+" is greatest");}
        else if(b>c)
        {System.out.println(b+" is greatest");}
        else 
        {System.out.println(c+" is greatest");}
        n.close();
    }
}
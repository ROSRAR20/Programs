import java.util.Scanner;
public class eleblltt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the electricity units");
        int a = n.nextInt();
        double b;
        if(a>250)
        {
            b=25+75+120+((double)(a-250)*1.50);
        }
        else if(a>150)
        {
            b=25+75+((double)(a-150)*1.20);
        }
        else if(a>50)
        {
            b=25+((double)(a-50)*0.75);
        }
        else
        {
            b=(double)a*0.5;
        }
        b+=b*0.20;
        System.out.println("Total electricity bill: "+b);
    }    
}
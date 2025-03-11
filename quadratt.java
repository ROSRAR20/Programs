import java.util.Scanner;
public class quadratt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the values of a b and c respectively");
        double a = n.nextInt();
        double b = n.nextInt();
        double c = n.nextInt();
        double d=b*b-4*a*c,r1,r2,di;
        if(d==0)
        {
            di=Math.sqrt(d);
            r1=-b+di/2*a;
            System.out.println("There is only one root: "+r1);
        }
        else if(d>0)
        {   
            di=Math.sqrt(d);
            r1=(-b+di)/(2*a);
            r2=(-b-di)/(2*a);
            System.out.println(d+"There are two roots they are "+r1+" "+r2);
        }
        else
        {
            System.out.println("The Roots are imaginery");
        }

    }
}
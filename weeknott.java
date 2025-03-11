import java.util.Scanner;
public class weeknott
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = n.nextInt();
        if(a==1)
        {System.out.println("Monday");}
        else
        if(a==2)
        {System.out.println("Tuesday");}
        else
        if(a==3)
        {System.out.println("Wednesday");}
        else
        if(a==4)
        {System.out.println("Thursday");}
        else
        if(a==5)
        {System.out.println("Friday");}
        else
        if(a==6)
        {System.out.println("Saturday");}
        else
        if(a==7)
        {System.out.println("Sundays");}
        else
        {System.out.println("Invalid week number");}
        n.close();
    }
}
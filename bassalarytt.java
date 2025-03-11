import java.util.Scanner;
public class bassalarytt
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        int b = n.nextInt();
        int s;
        if(b<=10000)
        {
            s = b+(b*20/100)+(b*80/100);
        }
        else if(b<=20000)
        {
            s = b+(b*25/100)+(b*90/100);
        }
        else 
        {
            s = b+(b*30/100)+(b*95/100);
        }
        System.out.println("Gross Salary: "+s);
    }    
}
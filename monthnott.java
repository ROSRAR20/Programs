import java.util.Scanner;
public class monthnott
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter month number");
        int b = n.nextInt();
        if(b<=12&&b>0)
        {if(b==2)
        {
           System.out.println("No of days are: 28/29");     
        }
        else if(b==1||b==3||b==5||b==7||b==8||b==10||b==12)
         {
           System.out.println("No of days are: 31");     
         }
         else
         {
            System.out.println("No of days are: 30");
         }}
        else
        {
            System.out.println("Invalid month");
        }
    }
}
import java.util.Scanner;
public class datett
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the date, month and year respectively");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        int ly = 29;
        if(b<=12&&b>0)
        {    
            if(b==2)
            {
                if(c%4==0)
                {
                    if(c%100==0)
                    {
                        if(c%400==0)
                        {
                            ly = 29;
                        }
                        else
                        {
                            ly = 28;
                        }
                    }
                    else
                    {
                        ly = 29;
                    }
                }
                else{
                    ly = 28;
                }
                if(a==ly)
                {
                    System.out.println(ly+"The date is correct");
                }
                else
                {
                    System.out.println(ly+"The date is incorrect");
                }
            }
            else
            if(b==1||b==3||b==5||b==7||b==8||b==10||b==12)
            {
                if(a<=31)
                {
                    System.out.println("The date is correct");
                }
                else{
                    System.out.println("The date is incorrect");
                }
            }
            else
            {
                if(a<=30)
                {
                    System.out.println("The date is correct");
                }
                else{
                    System.out.println("The date is incorrect");
                }
            }
        }
        else
        {
            System.out.println("The date is incorrect");
        }
        n.close();
    }
}
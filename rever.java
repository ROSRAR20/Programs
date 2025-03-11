import java.util.Scanner;
public class rever
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a =n;
        int rvr=0;
        while(a!=0)
        {
            rvr=rvr*10+(a%10);
            a/=10;
        }
        
        System.out.println(rvr);
    }
}
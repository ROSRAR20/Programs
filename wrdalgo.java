import java.util.Scanner;
public class wrdalgo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        while(n>0)
        {
            if(n==1)
            {
                System.out.println(n);
                break;
            }
            if(n%2==0)
            {
                System.out.print(n+" ");
                n/=2;
            }
            else
            {
                System.out.print(n+" ");
                n=n*3+1;
            }
        }
    }
}
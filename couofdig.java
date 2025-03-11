import java.util.Scanner;
public class couofdig
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a =n;
        int count=0;
        while(a>0)
        {
            a/=10;count++;
        }
        System.out.println(count);
    }
}
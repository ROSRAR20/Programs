import java.util.Scanner;
public class misnum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long n =s.nextInt();
        long sum=0;
        int a;
        for(int i=0;i<n-1;i++)
        {
            a=s.nextInt();
            sum+=a;
        }
        System.out.println(((n*(n+1))/2)-sum);  
    }
}
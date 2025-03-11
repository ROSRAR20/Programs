import java.util.Scanner;
public class csesperm
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long i;
        int c=0;
        if(n==1)
        {
            System.out.println(n);
        }
        if(n==2||n==3)
        {
            System.out.println("NO SOLUTION");
        }
        else
        {
            for(i=2;i<=n;i+=2)
            {
                System.out.println(i);
                if((i==n||i==n-1)&&c==0)
                {
                    i=1;
                    c++;
                    System.out.println(i);
                }
            }
        }
    }
}
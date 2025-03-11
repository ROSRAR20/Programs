import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        StringBuilder a = new StringBuilder(x);
        char c = a.charAt(0);
        int e =49; 
        a.setCharAt(1, c);
        System.out.print(a+" "+(int)c+" "+(char)e);
        }
    }



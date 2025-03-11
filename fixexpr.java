import java.util.Scanner;
public class fixexpr
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String b;
        char c;
        int n,m;
        for(int i=0;i<t;i++)
        {
            b=s.next();
            c=b.charAt(0);
            n = c -'0';
            c=b.charAt(2);
            m = c -'0';
            if(n==m)
            {
                System.out.println(n+"="+m);
            }
            else if(n>m)
                {
                    System.out.println(n+">"+m);
                }
                else if(n<m)
                    {
                        System.out.println(n+"<"+m);
                    }
        }
        s.close();
    }
}
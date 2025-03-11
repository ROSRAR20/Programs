import java.util.Scanner;
public class numspiral
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long y,x;
        long ans=1;
        for(int i = 0;i<t;i++)
        {
            y=s.nextInt();
            x=s.nextInt();
            if(y>x)
            {
                if(y%2==0)
                {
                    ans = y*y - (x-1);
                }  
                else
                {
                    ans = ((y-1) *(y-1)+1) + (x-1);
                }
            }
            else
            {
                if(x%2!=0)
                {
                    ans = x*x - (y-1);
                }
                else{
                    ans = ((x-1)*(x-1)+1) + (y-1);
                }
            }
            System.out.println(ans);
        }
    }
}
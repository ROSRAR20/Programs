import java.util.Scanner;
public class journey
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int tot,b,j;
        int[] a = new int[4];
        for(int i=0;i<t;i++)
        {
            b = s.nextInt();
            a[1]=s.nextInt();
            a[2]=s.nextInt();
            a[0]=s.nextInt();
            tot = 0;
            j=1;
            if(a[0]==a[1]&&a[1]==a[2])
            {
                j = b%a[0]==0?b/a[0]:(b/a[0])+b%a[0];
            }
            else
            {
            while(tot<b)
            {
                tot += a[j%3];
                if(tot>=b)
                {

                }
                else
                {j++;}
            }
            }
            System.out.println(" "+j);  
        }
    }
}
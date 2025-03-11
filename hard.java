import java.util.Scanner;
public class hard
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int c = n.nextInt();
        int[][] a= new int[c][4];
        for(int i = 0;i<c;i++)
        {
            for(int j = 0;j<4;j++)
            {
                a[i][j]=n.nextInt();
            }
            int tr= a[i][0]*2;
            int t=0;
            if(a[i][0]<=a[i][1])
            {
                t+=a[i][0];
            }
            else
            {
                t+=a[i][1];
            }
            if(a[i][0]<=a[i][2])
            {
                t+=a[i][0];
            }
            else
            {
                t+=a[i][2];
            }
            t+=a[i][3];
            if(t<=tr)
            {
                System.out.println(t);
            }
            else
            {
                System.out.println(tr);
            }
        }
    }
}
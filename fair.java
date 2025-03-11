import java.util.Scanner;
public class fair
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int s=n.nextInt();
        int[][] a= new int[s][4];
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=n.nextInt();
            }
        }
        for(int i=0;i<s;i++)
        {
            if(!((a[i][0]<a[i][2]&&a[i][1]<a[i][3]&&a[i][0]<a[i][3]&&a[i][1]<a[i][2])||(a[i][2]<a[i][0]&&a[i][3]<a[i][1]&&a[i][3]<a[i][0]&&a[i][2]<a[i][1])))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
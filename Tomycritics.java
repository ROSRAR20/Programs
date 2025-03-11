import java.util.Scanner;
public class Tomycritics
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        int[][] b = new int[s][3];
        for(int i =0;i<s;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=n.nextInt();
            }
        }
        for(int i=0;i<s;i++)
        {
            if((b[i][0]<=9&&b[i][0]>=0)&&(b[i][1]<=9&&b[i][1]>=0)&&(b[i][2]<=9&&b[i][2]>=0))
            {
                if((b[i][0]+b[i][1]>=10)||(b[i][1]+b[i][2]>=10)||(b[i][0]+b[i][2]>=10))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else
            {
                System.out.println("NO");
            }
            
        }

    }
}
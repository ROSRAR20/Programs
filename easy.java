import java.util.Scanner;
public class easy
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int c =n.nextInt();
        int[] d = new int[c];
        int a=0,b=0,e=0;
        for (int i = 0; i < c; i++) {
            d[i]=n.nextInt();
            e=0;
            a=0;
            b=0;
            for(int j = 1;j<=d[i];j++)
            {
                b=j;
                a=d[i]-b; 
                if(a>0)
                {
                    e++;
                }
            }
            System.out.println(e);
        }
        
    }
}
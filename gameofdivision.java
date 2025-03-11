import java.util.Scanner;
public class gameofdivision
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int x,n,k;
        for(int i =0;i<t;i++)
        {
            n=s.nextInt();
            k=s.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=s.nextInt(); 
            }
        }
    }
}
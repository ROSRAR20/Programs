import java.util.Scanner;
public class abplus
{
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        int s=n.nextInt();
        int[] a= new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=n.nextInt();
        }
        int sum;
        for(int i=0;i<s;i++)
        {
            sum=(a[i]%10)+((a[i]/10)%10);
            System.out.println(sum);
        }
    }
}
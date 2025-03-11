import java.util.Arrays;
import java.util.Scanner;
public class removeele_leetcode
{
    public static void main(String[] args) {
        {
            Scanner n = new Scanner(System.in);
            int[] a = new int[5];
            for(int i =0;i<5;i++)
            {
                a[i]=n.nextInt();
            }
            int val =n.nextInt();
            int j =0;
            for(int num:a)
            {
                if (num != val)
                {
                    a[j++]=num;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
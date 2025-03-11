import java.util.Scanner;
public class goodkid
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int r=n.nextInt();
        for(int i=0;i<r;i++)
        {
            int c=n.nextInt();
            int[] a= new int[c];
            for(int j=0;j<c;j++)
            {
                a[j]=n.nextInt();
            }
            int min =0;
            for(int j=0;j<c;j++)
            {
               if(a[j]<a[min])
               {
                min = j;
               }
               
            }
            
            int pro=1;
            for(int j=0;j<c;j++)
            {
                if(j==min)
                {
                    pro*=(a[j]+1);
                }
                else
                {
                    pro*=a[j];
                }
            }
            System.out.println(pro);
        }
    }
}
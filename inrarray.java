import java.util.Scanner;
public class inrarray {
    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            long m=0;
            long[] a= new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            for(int i=1;i<n;i++)
            {
                if(a[i]<a[i-1])
                {
                    m+=a[i-1]-a[i];
                    a[i]=a[i-1];
                }
                
            }
            System.out.println(m);
        }
    }
}
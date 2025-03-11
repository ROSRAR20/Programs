 import java.util.Scanner;
 public class startup
 {
    public int mx(int[] a)
    {
        int max =0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[max])
            {
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        startup a = new startup();
        int t= s.nextInt();
        int n,k,max=0,x;
        for(int i=0;i<t;i++)
        {
            n = s.nextInt();
            k = s.nextInt();
            int[] b = new int[k];
            int[] c = new int[k];
            for(int j=0;j<k;j++)
            {
                b[j]=s.nextInt();
                c[j]=s.nextInt();
            }
            if(n>k||n==k)
            {
                max=0;
                for(int j=0;j<k;j++)
                {
                    max+=c[j];
                }
            }
            else if(n==1)
                 {
                    x=a.mx(c);
                    max=0;
                    for(int j =0;j<k;j++)
                    {
                        if(b[j]==b[x])
                        {
                            max+=c[j];
                        }
                    }
                 }
            System.out.println(max);
        }
    }
 }
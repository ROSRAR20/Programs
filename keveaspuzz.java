import java.util.Scanner;
public class keveaspuzz
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        int n;
        String[] a = new String[t] ;
        int f;
        for(int i = 0;i<t;i++)
        {
            n=s.nextInt();
            a[i]=s.nextLine();
            int[] b = new int[n];
            f=0;
            int j=0;
            if(i>0 )
            {while(j<=n)
            {
                int l,r;
                if(a[i].charAt(j)=='L')
                {
                    l=1;
                    r=j;
                }
                else
                {
                    l=j+2;
                    r=n;
                }


                if(l>r)
                {
                    b[j]=0;
                }
                else
                {
                    if(l<0)
                    {
                        f=-1;
                        break;
                    }
                    else
                    {b[j]=l;}
                }
                j++;
            }
            if(f==0)
            {
                for(int ele:b)
                {
                    System.out.print(ele+" ");
                }
            }}
          

        }
    }
}
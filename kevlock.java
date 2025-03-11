import java.util.Scanner;
public class kevlock
{
      
    public static void lck()
    {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int f;
        String c =Integer.toString(l);
        int n=Integer.parseInt(c);
        int[] a = new int[c.length()];
        while(n>0)
        {
          if(n>33)
          {
            for(int i =0 ;i<c.length();i++)
            {
              a[i]=(int)c.charAt(i);
            }
            f=0;
            for(int i=0;i<c.length();i++)
            {
              if(a[i]==3)
              {
                if(a[i+1]==3)
                {
                  f=1;
                  a[i]=-1;
                  a[i+1]=-1;
                  n = a[0];
                  for(int j=1;j<c.length();j++)
                  {
                    if(a[j]!=-1)
                    {
                      n*=10 +a[j];
                    }
                  }
                }
              }
            }
            if(f!=0)
            {
              n-=33;
            }
          }
          else
          {
            break;
          }
        }
        if(n==0)
        {
          System.out.println("YES");
        }
        else
        {
          System.out.println("NO");
        }
    }
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      int t = s.nextInt(); 

      for (int i=0;i<t;i++)
      {
        lck();
      }
    }
}
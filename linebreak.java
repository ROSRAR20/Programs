import java.util.Scanner;
public class linebreak
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n;
        int m;
        int cnt;
        int sum;
        String[] strings = new String[50];
        for (int j=0;j<t;j++)
        {
            n = s.nextInt();
            m = s.nextInt();
            cnt =0;
            for (int i = 0; i < 50; i++) 
            {
                if(i>n)
                {
                    break;
                    }
                strings[i] = s.nextLine();
            }
            sum=strings[1].length();
            //System.out.println(strings[1]+" sum"+j+"="+sum);
            for (int i =0;i<=n&&m>0;i++)
            {
                if(i==0)
                {
                    
                }
                else
                {
                    
                   if(sum<=m)
                   {
                     if(strings[i].length()<=m-sum) 
                    {
                        sum+=strings[i].length();
                        cnt++;
                    }
                    }
                   else{
                    break;
                   }
                }
            }
            if(sum<=m)
            {
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}

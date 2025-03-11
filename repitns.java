import java.util.Scanner;
public class repitns
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int mc =1,c;
        c=1;
        for(int i=1;i<a.length();i++)
        {
          
          if(a.charAt(i)==a.charAt((i-1)))
          {
             c++;
             mc=mc<c?c:mc;
          }
          else
          {
            if(mc<c)
            {
                mc=c;
            }
            c=1;
          }
        }
        System.out.println(mc);
    }
}
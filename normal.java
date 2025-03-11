import java.util.Scanner;
public class normal
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int c =n.nextInt();
        String[] a= new String[c+1]; 
        for(int i =0;i<=c;i++)
        {
            a[i]=n.nextLine();
            for(int j=a[i].length()-1;j>=0;j--)
            {   if(a[i].charAt(j)=='p')
                {
                    System.out.print("q");
                }
                else
                if(a[i].charAt(j)=='q')
                {
                    System.out.print("p");
                }
                else
                {
                    System.out.print(a[i].charAt(j));
                }
            }
            System.out.println("");
        }  
        System.out.print(a[0]);
    }
}
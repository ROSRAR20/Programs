import java.util.Scanner; 
class pattern 
{
    public static void main (String[] args)
    {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter :" );
        int s=n.nextInt();
        int coef;
        for(int i=1;i<=s;i++)
        {
            for(int y=s-1-i;y>=0;y--)
            {
                System.out.print(" ");
            }
            coef=1;
            for(int j=s-1-i;j<=s;j++)
            {
                System.out.print(coef+" ");
                coef=coef*(i-j)/j;
                
            }
            
            System.out.println();
        }
    }
}
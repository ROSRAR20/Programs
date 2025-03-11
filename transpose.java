import java.util.Scanner;
class transpose
{
    public static void main(String[] args)
    {
        Scanner n= new Scanner(System.in);
        int[][] a= new int[5][5];
        int[][] b= new int[5][5];
        int[][] re= new int[5][5];
        int r1,c1,r2,c2;
        // int[] sc= new int[10];
        // int[] sr= new int[10];
        System.out.println("Enter the row and columns: ");
        r1=n.nextInt();
        c1=n.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {   
                
                a[i][j]=n.nextInt();
            }
        }
        System.out.println("Enter the row and columns: ");
        r2=n.nextInt();
        c2=n.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {   
                
                b[i][j]=n.nextInt();
            }
        }
        if(c1==r2){
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                re[i][j]=0;
                for(int k=0;k<c1;k++)
                {
                    re[i][j]+=a[j][k]*a[k][j];
                }
            }
        }
        System.out.println("Result: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {   
                System.out.print(re[i][j]+" ");
                
            }
            System.out.println();
        }
        }
        else{
            System.out.println("cannot multiply");
        }
        /*System.out.println("the elements are: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {   
              System.out.print(a[i][j]);  
               
            }
            System.out.println();
        }
        /*System.out.println("transpose: ");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {   
              System.out.print(a[j][i]);  
               
            }
            System.out.println();
        }
       for(int i=0;i<r;i++)
        {
             sr[i]=0;
            for(int j=0;j<c;j++)
            {   
                sr[i]+=a[i][j];
               
            }
            
        }
        for(int i=0;i<c;i++)
        {
             sc[i]=0;
            for(int j=0;j<r;j++)
            {   
                sc[i]+=a[j][i];
               
            }
            
        }
        System.out.println("Sum of row");
        for(int i=0;i<r;i++)
        {
            System.out.println(sr[i]);
        }
        System.out.println("Sum of column");
        for(int i=0;i<c;i++)
        {
            System.out.println(sc[i]);
        }*/
    
    }
}
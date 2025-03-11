import java.util.Scanner;
public class d1 
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
       
        
        int[][] a = new int[1000][10];
        int s=n.nextInt();
        int c1=n.nextInt();
        
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<c1;j++)
            {   
                
                a[i][j]=n.nextInt();
            }
        }
         //for(int j=0;j<s;j++)
           // {
             //   System.out.println(a[j][0]);//sum=sum+(a[j][0]-a[j][1]);
            //}
        int i=0,j,c,p,o,sum=0;   
        while(i<s)
        {
            c=0;
            for(j=0;j<s;j++)
            {
                if(a[i][0]==a[j][1])  
              {
                c++;
              }
            }
            p=a[i][0]*c;
            sum=sum+p;
            i++;
            
        } 
        /*for(int i=0;i<2;i++)
        {   
             o=0;
             for(int j=0;j<s;j++)
            {
                c=0;
                p=0;
               for(int k=1;k<s;k++)
            {
              if(a[k-1][i]==a[k][i])  
              {
                c++;

              }
            }
              p=a[o][0]*c;
              sum=sum+p;
              System.out.print(p);
              o++;
            }
            //System.out.println();
        }*/
        /*int sum =0;
        int j ;
        int p;
            for(j=0;j<s;j++)
            {
                p=a[j][0]-a[j][1];
                if(p<0)
                {
                    p*=-1;
                }
                sum=sum+p;
                /*System.out.print(sum);
                System.out.println(p);*/
            
          
         System.out.println(sum);  
    }
}
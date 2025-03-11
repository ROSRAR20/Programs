import java.util.Scanner;
public class matmultuseriput { 

    public static int[][]multMat(int[][]m1,int[][]m2,int cols1,int rows2){ 

        int rows1 =m1.length; 

        int cols2 =m2[0].length; 

        int[][]result=new int[rows1][cols2]; 

        if(cols1!=rows2){ 

            System.out.print("no. of columns in m1 must be equal to no. of rows in m2!"); 

        } 

        for(int i=0;i<rows1;i++){ 

            for(int j=0;j<cols2;j++){ 

                result[i][j]=0; 

                for(int k=0;k<cols1;k++){ 

                    result[i][j]+=m1[i][k]*m2[k][j]; 

                } 

            } 

        } 

        return result; 

    } 

    public static void main(String[] args){ 

        Scanner n=new Scanner(System.in); 

        int[][]m1=new int[3][3]; 

        int[][]m2=new int[3][3]; 

        System.out.println("Enter the row and column size of the first matrix "); 

        int rows1=n.nextInt(); 

        int cols1=n.nextInt(); 

        System.out.println("Enter the row and column size of the secoond matrix "); 

        int rows2=n.nextInt(); 

        int cols2=n.nextInt(); 

        System.out.println("Enter the elements of first matrix "); 

         for(int i=0;i<rows1;i++){ 

        for(int j=0;j<cols1;j++){ 

           m1[i][j]=n.nextInt(); 

    } 

    } 

         System.out.println("Enter the elements of second matrix "); 

         for(int i=0;i<rows2;i++){ 

        for(int j=0;j<cols2;j++){ 

           m2[i][j]=n.nextInt(); 

    } 

    } 

        int[][]result=multMat(m1, m2, cols1, rows2); 

        if(cols1==rows2){ 

            System.out.println("Result of matrix muliplication: "); 

            for(int i=0;i<result.length;i++){ 

                for(int j=0;j<result[0].length;j++){ 

                    System.out.print(result[i][j]+" "); 

                } 

                System.out.println(); 

            } 

        } 

    } 

}
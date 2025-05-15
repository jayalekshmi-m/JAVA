import java.util.Scanner;

public class matrix_add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows for first matrix:");
        int r1=sc.nextInt();
        System.out.println("enter number of coloumns for first matrix:");
        int c1=sc.nextInt();
        System.out.println("enter number of rows for second matrix:");
        int r2=sc.nextInt();
        System.out.println("enter number of coloumns for second matrix:");
        int c2=sc.nextInt();
        int[] [] matrix1=new int[r1][c1];
        int[][] matrix2=new int[r2][c2];
        int[][] add=new int[r1][c1];
        int[][] mul=new int[r1][c1];


        if(r1 != r2 || c1 != c2)
        {
            System.out.println("Matrix dimensions must be the same for addition");
            return;
        }
        //matrix1
        System.out.println("enter elements for first matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
{
        matrix1[i][j]=sc.nextInt();
}

        }
        //matrix2
        System.out.println("enter elements for second matrix:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        //add
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                add[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        //display
        System.out.println("matrix after addition:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        if(c1 != r2)
        {
            System.out.println("Matrix multiplication is not possible. The number of columns of the first matrix must be equal to the number of rows of the second matrix");
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                mul[][]=0;
                for(k=0;k<c1;k++)
                {
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("matrix after multiplication:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(mul[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}

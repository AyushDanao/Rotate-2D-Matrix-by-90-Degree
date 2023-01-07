import java.util.Scanner;

public class rotate_by_90_in_anticlockwise {
    static void printarray(int[][] arr)
    {
        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] matrix, int r, int c)
    {
        int[][] ans= new int[r][c];
        for (int i=0;i<c;i++)
        {
            for(int j=i;j<r;j++)
            {
//                ans[i][j] =matrix[j][i];
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    // reverse vertically
    static void reverse(int[][] matrix, int r , int c)
    {
        int[][] ans = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[i][j]= matrix[r-1-i][j];
            }
        }
       printarray(ans);
    }
    static void rotate(int[][] matrix , int r ,int c)
    {
        transpose(matrix,r,c);
        reverse(matrix,r,c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix= new int[r][c];
        System.out.println("enter elemnts in matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("original matrix");
        printarray(matrix);
        System.out.println("rotated matrix:");
        rotate(matrix,r,c);
    }
}

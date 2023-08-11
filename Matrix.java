import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter the number of colums: ");
        int cols = s.nextInt(); 

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements one by one: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("The matrix is: ");

        Func m1 = new Func(matrix);

        m1.printMatrix(matrix);

         if (m1.isSquareMatrix(matrix)) {
            if (m1.isIdentityMatrix(matrix)) {
                System.out.println("The matrix is an Identity matrix.");
            } else if (m1.isDiagonalMatrix(matrix)) {
                System.out.println("The matrix is a Diagonal matrix.");
            } else {
                System.out.println("The matrix is a Square matrix.");
            }
        } else if (m1.isRectangleMatrix(matrix)) {
            System.out.println("The matrix is a Rectangle matrix.");
        } else if (m1.isRowMatrix(matrix)) {
            System.out.println("The matrix is a Row matrix.");
        } else if (m1.isColumnMatrix(matrix)) {
            System.out.println("The matrix is a Column matrix.");
        } else {
            System.out.println("The matrix doesn't fit any of the defined types.");
        }
    }
}

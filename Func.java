public class Func {

    int matrix[][];

    public Func(int[][] matrix) {
        this.matrix = matrix;
    }

    public boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        return rows == columns;
    }
    
    public boolean isIdentityMatrix(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean isDiagonalMatrix(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isRectangleMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        return rows != columns && rows > 1 && columns > 1;
    }
    
    public boolean isRowMatrix(int[][] matrix) {
        return matrix.length == 1;
    }
    
    public boolean isColumnMatrix(int[][] matrix) {
        return matrix[0].length == 1;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
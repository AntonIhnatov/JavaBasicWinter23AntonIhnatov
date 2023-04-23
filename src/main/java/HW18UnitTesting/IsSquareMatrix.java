package HW18UnitTesting;

public class IsSquareMatrix {
    public static String isSquareMatrix(int [][] matrix){
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        String squareMatrix = "This matrix is square";
        String notSquareMatrix = "This matrix is not square";
        if (numRows != numCols){
            return notSquareMatrix;
        }
        for (int i = 0; i < numRows; i++) {
            if (matrix[i].length != numCols) {
                return notSquareMatrix;
            }
        }
        return squareMatrix;
    }
}

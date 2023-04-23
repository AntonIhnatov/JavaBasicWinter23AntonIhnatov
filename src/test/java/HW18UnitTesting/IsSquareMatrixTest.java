package HW18UnitTesting;

import junit.framework.TestCase;

public class IsSquareMatrixTest extends TestCase {

    public void testIsSquareMatrix() {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        String status = IsSquareMatrix.isSquareMatrix(matrix);
        System.out.println(status);

        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 3, 2} };
        String status1 = IsSquareMatrix.isSquareMatrix(matrix1);
        System.out.println(status1);
    }
}
package HWTwoDimensionalArraysAlgorithms;
import java.util.Scanner;

public class HW11TranspositionOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть потрібну кількість строк матриці: ");
        int matrixRow = sc.nextInt();
        System.out.println("Введіть потрібну кількість столбців матриці: ");
        int matrixColumn = sc.nextInt();

        int [][] sourceMatrix = new int[matrixRow][matrixColumn];
        int [][] invertedMatrix = new int[matrixColumn][matrixRow];

        System.out.println("Оригінальна матриця MxN: ");
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                sourceMatrix[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + sourceMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        System.out.println("Змінена матриця NxM: ");
        for (int i = 0; i < matrixColumn; i++) {
            for (int j = 0; j < matrixRow; j++) {
                invertedMatrix[i][j] = sourceMatrix[j][i];
                System.out.print(" " + invertedMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

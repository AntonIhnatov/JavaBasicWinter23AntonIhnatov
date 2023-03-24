package HWTwoDimensionalArraysAlgorithms;
import java.util.Arrays;
import java.util.Scanner;

public class HW10Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arraySystem = new int[7];

        for (int i = 0; i < arraySystem.length ; i++) {
            arraySystem[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < arraySystem.length - 1; i++) {
            for (int j = arraySystem.length - 1; j > i; j--) {
                if (arraySystem[j - 1] > arraySystem[j]) {
                    int tmp = arraySystem[j - 1];
                    arraySystem[j - 1] = arraySystem[j];
                    arraySystem[j] = tmp;
                }
            }
        }

        int [] arrayUser = new int[7];
        for (int i = 0; i < arrayUser.length; i++) {
            System.out.println("Введіть своє число у лотерею: ");
            arrayUser[i] = sc.nextInt();
        }

        for (int i = 0; i < arrayUser.length - 1; i++) {
            for (int j = arrayUser.length - 1; j > i; j--) {
                if (arrayUser[j - 1] > arrayUser[j]) {
                    int tmp = arrayUser[j - 1];
                    arrayUser[j - 1] = arrayUser[j];
                    arrayUser[j] = tmp;
                }
            }
        }

        int hitCounter = 0;
        for(int i = 0; i < arraySystem.length; i++){
            if (arraySystem[i] == arrayUser[i]) {
                hitCounter += 1;
            }
        }
        System.out.println("\n");
        System.out.println("Числа, які загадані фірмою-організатором лотереї: ");
        System.out.println(Arrays.toString(arraySystem));
        System.out.println("Числа які вписав гравець лотереї: ");
        System.out.println(Arrays.toString(arrayUser));
        System.out.println("Кількість збігів лотереї: " + hitCounter);
    }
}

package HWCyclesWorkWithArrays;
import java.util.Scanner;

public class HW7GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 11);

        for (int i = 0; i < 3; i++) { //3 спроби
            System.out.println("Введіть своє число. Спроб залишилось: " + (3 - i));
            if (!sc.hasNextInt()) {
                System.out.println("Wrong data");
                System.exit(0);
            }
            int numberOfUser = sc.nextInt();
            if (numberOfUser == randomNumber) {
                System.out.println("Ви вгадали число, це число: " + randomNumber);
                break;
            } else {
                System.out.println("Не вгадали! Спробуйте ще раз." + "\n");
            }
        }
    }
}

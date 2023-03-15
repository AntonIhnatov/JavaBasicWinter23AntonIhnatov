package HWArithmeticOperators;

public class HW4Parallelepiped {
    public static void main(String[] args) {
        int longParallelepiped = 10;
        int widthParallelepiped = 20;
        int heightParallelepiped = 8;

        //Формула Об'єму прямокутного паралелепіпеда
        int volume = longParallelepiped * widthParallelepiped * heightParallelepiped;

        //Формула сумарної довжини всіх сторін прямокутного паралелепіпеда
        int length = 4 * (longParallelepiped + widthParallelepiped + heightParallelepiped);

        System.out.println("Об'єм прямокутного паралелепіпеда = " + volume + " см");
        System.out.println("Сумарна довжина всіх сторін прямокутного паралелепіпеда = " + length + " см");

    }
}

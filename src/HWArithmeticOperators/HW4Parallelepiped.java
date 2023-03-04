package HWArithmeticOperators;

public class HW4Parallelepiped {
    public static void main(String[] args) {
        int Long = 10;
        int Width = 20;
        int Height = 8;

        //Формула Об'єму прямокутного паралелепіпеда
        int volume = Long * Width * Height;

        //Формула сумарної довжини всіх сторін прямокутного паралелепіпеда
        int length = 4 * (Long + Width + Height);

        System.out.println("Об'єм прямокутного паралелепіпеда = " + volume + " см");
        System.out.println("Сумарна довжина всіх сторін прямокутного паралелепіпеда = " + length + " см");

    }
}

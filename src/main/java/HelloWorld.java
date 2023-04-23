import java.math.BigDecimal;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("Nice to meet you to!");
//        int a = 8;
//        int b = --a;
//        System.out.println(a);
//        System.out.println(b);

//        int a = 8;
//        int b = a--;
//        int y = b+2;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(y);
//        for (int i = 0; i <= 3; i++) {
//            System.out.println(i);
//        }
        double d = 2.0 - 1.1;
        System.out.println(d);
        BigDecimal number1 = BigDecimal.valueOf(2.0);
        BigDecimal number2 = BigDecimal.valueOf(1.1);
        BigDecimal num3 = number1.subtract(number2);
        System.out.println(num3);


    }
}

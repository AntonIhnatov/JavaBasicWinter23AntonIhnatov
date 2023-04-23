package HW16Interfaces;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        iPhones iPhones = new iPhones();
        androids.call("123-456-7890");
        androids.sms("123-456-7890", "Hello from Android!");
        androids.internet("www.google.com");
        androids.systemCompatibilityLinuxOS("Linux");
        System.out.println("------------------------------------------------------------");
        iPhones.call("123-456-7890");
        iPhones.sms("123-456-7890", "Hello from iPhone!");
        iPhones.internet("www.apple.com");
        iPhones.systemCompatibilityIOS("iOS");
    }
}

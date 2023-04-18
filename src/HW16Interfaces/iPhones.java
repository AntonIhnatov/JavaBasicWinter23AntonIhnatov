package HW16Interfaces;

public class iPhones implements Smartphones, iOS{

    @Override
    public void systemCompatibilityIOS(String iPhoneOS) {
        System.out.println("Compatibility with " + iPhoneOS + " on an iPhone.");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " on an iPhone.");
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + " on an iPhone. Message: " + message);
    }

    @Override
    public void internet(String url) {
        System.out.println("Browsing " + url + " on an iPhone.");
    }
}

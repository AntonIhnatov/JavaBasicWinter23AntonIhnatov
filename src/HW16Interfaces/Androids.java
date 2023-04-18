package HW16Interfaces;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void systemCompatibilityLinuxOS(String linuxOS) {
        System.out.println("Compatibility with " + linuxOS + " on an Android.");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " on an Android.");
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + " on an Android. Message: " + message);
    }

    @Override
    public void internet(String url) {
        System.out.println("Browsing " + url + " on an Android.");
    }
}

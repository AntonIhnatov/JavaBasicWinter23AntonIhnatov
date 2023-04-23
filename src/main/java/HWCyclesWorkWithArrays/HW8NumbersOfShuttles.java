package HWCyclesWorkWithArrays;

public class HW8NumbersOfShuttles {
    public static void main(String[] args) {
        int counter = 1;
        int shuttleNumber = 0;

        while (counter <= 100) {
            String shuttleSerialNumber = String.valueOf(++shuttleNumber);
            if ((shuttleSerialNumber.contains("4") || shuttleSerialNumber.contains("9"))) {
                continue;
            }
            System.out.println(counter + ": Шатл за номером - " + shuttleNumber);
            counter++;
        }
    }
}


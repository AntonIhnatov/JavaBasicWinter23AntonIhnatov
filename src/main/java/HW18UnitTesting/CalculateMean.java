package HW18UnitTesting;

public class CalculateMean {
    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum / arr.length);
    }
}

package HW18UnitTesting;

public class CalculateMean {
    public static double calculateMean(int[] arr) {
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        mean = (sum / arr.length);
        if (arr.length == 0) {
            return Double.parseDouble(null);
        } else {
            return mean;
        }
    }
}

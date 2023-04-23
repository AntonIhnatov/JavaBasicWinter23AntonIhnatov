package HW18UnitTesting;

import junit.framework.TestCase;

public class CalculateMeanTest extends TestCase {

    public void testCalculateMean() {
        int[] arr = { 5, 2, 1, 6, 8 };
        double mean = CalculateMean.calculateMean(arr);
        System.out.println("The mean of the array is: " + mean);
        int[] arr1 = { };
        double mean1 = CalculateMean.calculateMean(arr1);
        System.out.println("The mean of the array is: " + mean1);
    }
}
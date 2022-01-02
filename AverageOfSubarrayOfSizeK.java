import java.util.Arrays;

/*
 ** Given an Array, Find the average of all contiguous arrays of size K in it
 * arr = {1, 2, 3, 4}
 * k = 2
 * {1+2/2, 2+3/2, 3+4/2}
 * {1.5, 2.5, 3.5}
 */
public class AverageOfSubarrayOfSizeK {

    // Time Complexity of this approach using brute force is O(n * k) where n is the number of elements in the input array
    // Inefficiency of this approach is that the overlapping part will be evaluated twice
    public static double[] findAveragesForSubarrayOfSizeKUsingBruteForce(int k, int[] arr) {
        double[] result = new double[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++) {
            // find sum of next k elements
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
                result[i] = sum / k;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("k = 2 , arr = {1, 2, 3, 4} " + Arrays.toString(findAveragesForSubarrayOfSizeKUsingBruteForce(2, new int[]{1, 2, 3, 4})));
        System.out.println("k = 2 , arr = {1, 2} " + Arrays.toString(findAveragesForSubarrayOfSizeKUsingBruteForce(2, new int[]{1, 2})));
    }
}

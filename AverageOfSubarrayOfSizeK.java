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

    /*
     * arr = {1, 2, 3, 4}
     * k = 2
     * {1+2/2, 2+3/2, 3+4/2}
     * {1.5, 2.5, 3.5}
     */

    // Time complexity of this approach using Sliding Window Pattern is O (n)
    public static double[] findAveragesForSubarrayOfSizeK(int k, int[] arr) {
        double[] result = new double[arr.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // Slide the window - We do not need to slide if we have hit the required window size of 'k'
            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k; // calculate the average
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // Slide the window ahead
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Brute Force Approach : k = 2 , arr = {1, 2, 3, 4} " + Arrays.toString(findAveragesForSubarrayOfSizeKUsingBruteForce(2, new int[]{1, 2, 3, 4})));
        System.out.println("Sliding Window Approach : k = 2 , arr = {1, 2, 3, 4} " + Arrays.toString(findAveragesForSubarrayOfSizeK(2, new int[]{1, 2, 3, 4})));
        System.out.println("Brute Force Approach :k = 2 , arr = {1, 2} " + Arrays.toString(findAveragesForSubarrayOfSizeKUsingBruteForce(2, new int[]{1, 2})));
        System.out.println("Sliding Window Approach : k = 2 , arr = {1, 2} " + Arrays.toString(findAveragesForSubarrayOfSizeK(2, new int[]{1, 2})));
    }
}

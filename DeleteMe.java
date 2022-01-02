import java.util.Arrays;

public class DeleteMe {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println("Sliding Window Approach : k = 2 , arr = {1, 2, 3, 4} " + Arrays.toString(findAveragesForSubarrayOfSizeK(k, arr)));
    }

    private static double[] findAveragesForSubarrayOfSizeK(int k, int[] arr) {
        double[] result = new double[arr.length - k + 1];
        int windowStart = 0;
        double windowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd]; // add the next element
            // Slide the window - we do not need to slide if we have hit the window size of 'k'
            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k; // calculate the average
                windowSum = windowSum - arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        return result;
    }
}

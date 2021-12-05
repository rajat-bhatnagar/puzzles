import java.util.Arrays;

public class SquaresOfASortedArray {

    // Approach 1 - Works fine using Stream but space-time complexity can be reduced from O(n log n)
    public int[] sortedSquaresUsingStreams(int[] nums) {
        // Constraints
        // 1 <= nums.length <= 104
        //-104 <= nums[i] <= 104
        //nums is sorted in non-decreasing order
        if (nums.length == 1) {
            return new int[]{nums[0] * nums[0]};
        }
        return Arrays.stream(nums)
                .map(x -> x * x)
                .sorted()
                .toArray();
    }

    // Approach 2 - Two Pointer solution speeds up the runtime to O( n )
    private int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = nums.length - 1;
        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[right]) > Math.abs(nums[left])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray obj = new SquaresOfASortedArray();
        System.out.println("O(n log (n)) - Squares of Sorted Array in non decreasing order - " + Arrays.toString(obj.sortedSquaresUsingStreams(new int[]{-4, -3, 0, 2, 3, 6})));
        System.out.println("O(n) - Squares of Sorted Array in non decreasing order - " + Arrays.toString(obj.sortedSquares(new int[]{-4, -3, 0, 2, 3, 6})));

        System.out.println("O(n log (n)) - Squares of Sorted Array in non decreasing order - " + Arrays.toString(obj.sortedSquaresUsingStreams(new int[]{-3, 0, 2, 3, 6, 7})));
        System.out.println("O(n) - Squares of Sorted Array in non decreasing order - " + Arrays.toString(obj.sortedSquares(new int[]{-3, 0, 2, 3, 6, 7})));

        System.out.println("O(n log (n)) - Squares of Sorted Array in non decreasing order - " + Arrays.toString(obj.sortedSquaresUsingStreams(new int[]{-4})));
        System.out.println("O(n) - Squares of Sorted Array in non decreasing order - " + Arrays.toString(obj.sortedSquares(new int[]{-4})));
    }
}

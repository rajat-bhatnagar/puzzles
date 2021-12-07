import java.util.Arrays;

public class Dronacharya {
    public static void main(String[] args) {
        int[] numbers = {-2, -1, 0, 3, 4, 6, 9};
        System.out.println("Sorted Array O(n log (n)) - " + Arrays.toString(numbers) + " after method call- " + Arrays.toString(sortIntArr(numbers)));
        System.out.println("Sorted Array O(n) - " + Arrays.toString(numbers) + " after method call- " + Arrays.toString(sortIntArrayUsingRightAndLeftPointers(numbers)));

        // delete last element from numbers
        int[] result = deleteFirstElementFromIntArray(numbers);
        System.out.println(" After Deletion " +Arrays.toString(result));
        System.out.println("Length : "+result.length);
    }

    private static int[] deleteFirstElementFromIntArray(int[] numbers) {
        return Arrays.copyOfRange(numbers, 1, numbers.length);
    }

    private static int[] sortIntArr(int[] numbers) {
        // This is O(n log (n)) performance on data sets
        return Arrays.stream(numbers)
                .sorted()
                .toArray();
    }

    // This is O(n) performance on data sets
    private static int[] sortIntArrayUsingRightAndLeftPointers(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
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
}

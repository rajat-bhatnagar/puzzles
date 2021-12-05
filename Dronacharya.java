import java.util.Arrays;

public class Dronacharya {
    public static void main(String[] args) {
        int[] numbers = {100, -1, -2, 0, 3, 4, 9, 6};
        System.out.println("Sorted Array - " + Arrays.toString(numbers) + " after method call- " + Arrays.toString(sortIntArr(numbers)));
    }

    private static int[] sortIntArr(int[] numbers) {
        // This is O(n log (n)) performance on data sets
        return Arrays.stream(numbers)
                .sorted()
                .toArray();
    }
}

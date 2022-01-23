import java.util.Arrays;
public class ArraysSwapEvenOdd {

    public static void main(String[] args) {
        int[] numbers = {6, 1, 2, 3, 4};
        System.out.println("Sorted Even Odd : " + Arrays.toString(swapEvenOdd(numbers)));
    }

    private static int[] swapEvenOdd(int[] input) {
        int nextEven = 0, nextOdd = input.length - 1;
        while (nextEven < nextOdd) {
            if (input[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = input[nextEven];
                input[nextEven] = input[nextOdd];
                input[nextOdd--] = temp;
            }
        }
        return input;
    }

}

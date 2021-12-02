import java.util.Optional;
import java.util.stream.IntStream;

class FindMaxElementInAnIncreasingDecreasingArray {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 20, 3, 3, 200, 300};
        System.out.print("Max : - " + findMaxElementInAnIncreasingDecreasingArray(numbers));
        System.out.print(" Max : - " + findMaxElementInAnIncreasingDecreasingArray(numbers) + "\n");

        int[] numbersA = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
        System.out.print("Max : - " + findMaxElementInAnIncreasingDecreasingArray(numbersA));
        System.out.print(" Max : - " + maxNumberUsingAStream(numbersA) + "\n");

        int[] numbersB = {1, 3, 50, 10, 9, 7, 6};
        System.out.print("Max : - " + findMaxElementInAnIncreasingDecreasingArray(numbersB));
        System.out.print(" Max : - " + maxNumberUsingAStream(numbersB) + "\n");

        int[] numbersC = {10, 20, 30, 40, 50};
        System.out.print("Max : - " + findMaxElementInAnIncreasingDecreasingArray(numbersC));
        System.out.print(" Max : - " + maxNumberUsingAStream(numbersC) + "\n");

        int[] numbersD = {120, 100, 80, 20, 0};
        System.out.print("Max : - " + findMaxElementInAnIncreasingDecreasingArray(numbersD));
        System.out.print(" Max : - " + maxNumberUsingAStream(numbersD) + "\n");

        int[] numbersE = {};
        System.out.print("Max : - " + findMaxElementInAnIncreasingDecreasingArray(numbersE));
        System.out.print(" Max : - " + maxNumberUsingAStream(numbersE) + "\n");
    }

    private static int findMaxElementInAnIncreasingDecreasingArray(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        int max = numbers[0]; // This can give a NPE if the input is an empty array
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    private static int maxNumberUsingAStream(int[] numbers) {
        return Optional.of(IntStream.of(numbers).max()).get().orElse(-1);
    }

}
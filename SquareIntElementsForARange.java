import java.util.Arrays;
import java.util.stream.IntStream;

public class SquareIntElementsForARange {

    public static void main(String[] args) {
        // ------------------------------------------------------------------
        int startInclusive = 6;
        int endInclusive = 10;
        // Square elements based on a range - Approach 1
        int[] inputElements = populateAndSquareElements(startInclusive, endInclusive);
        System.out.println("APPROACH 1 - Square of Populated int array for a range : "+Arrays.toString(inputElements));

        // Square elements based on a range - Approach 2
        int[] inputElementsForRange = populateElementsAndSquare(startInclusive, endInclusive);
        System.out.println("APPROACH 2 - Square of Populated int array for a range :: "+Arrays.toString(inputElementsForRange));

        // ------------------------------------------------------------------
    }

    private static int[] populateElementsAndSquare(int startInclusive, int endInclusive) {
        return IntStream
                .range(startInclusive, endInclusive)
                .boxed()
                .mapToInt(Integer::intValue)
                .map(i -> i *i)
                .toArray();
    }

    private static int[] populateAndSquareElements(int startInclusive, int endInclusive) {
        int[] elements = new int[endInclusive - startInclusive];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = startInclusive;
            //overwrite the element
            elements[i] =  elements[i] * elements[i];
            startInclusive++;
        }
        return elements;
    }

}

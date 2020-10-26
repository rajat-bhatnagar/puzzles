import java.util.*;
import java.util.stream.*;
class RemoveDuplicates {
  public static void main(String[] args) {
    int[] numbers = {1, 3, 1, 4, 5};
    System.out.println("Distinct Numbers - "+Arrays.toString(removeDuplicatesFromIntArray(numbers)));
    String[] colors = {"red", "blue", "red"};
    System.out.println("Distinct colors - "+Arrays.toString(removeDuplicatesFromStringArr(colors)));

  }

  private static int[] removeDuplicatesFromIntArray(int[] input){
    return Arrays.stream(input)
    .boxed()
    .distinct()
    .mapToInt(Integer::intValue)
    .toArray();
  }

  private static String[] removeDuplicatesFromStringArr(String[] input) {
    return Arrays.stream(input)
    .distinct()
    .toArray(String[]::new);
  }
}
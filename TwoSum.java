import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // approach 1 - brute force
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // approach 2 - Two pass hash table
    public int[] twoSumTwoPass(int[] numbers, int target) {
        Map<Integer, Integer> numbersMap = new HashMap<>();
        // Put the elements in the map
        for (int i = 0; i < numbers.length; i++) {
            numbersMap.put(numbers[i], i);
        }
        // x + y = target , x = target - y
        for (int i = 0; i < numbers.length; i++) {
            int targetComplement = target - numbers[i];
            if (numbersMap.containsKey(targetComplement)) {
                // Since order doesn't matter we can return the indexes in any order
                return new int[]{i, numbersMap.get(targetComplement)};
            }
        }
        return null;
    }

    // Approach 3 - Single Pass Hashtable
    // Time O(n)
    // Space O(n)
    public int[] twoSum(int[] numbers, int target) {
        // elementA + currentElement = target - figure ( index(elementA) , index(currentElement) )
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            // current + x = target
            // x = target - current
            int x = target - current;
            if (numsMap.containsKey(x)) {
                return new int[]{numsMap.get(x), i};
            }
            numsMap.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(" *** Brute Force **");
        System.out.println(Arrays.toString(twoSum.twoSumBruteForce(new int[]{2, 6, -3, 7}, -1)) + "\n");
        System.out.println(" *** Two Pass Hashtable **");
        System.out.println(Arrays.toString(twoSum.twoSumTwoPass(new int[]{2, -3, 3, 7}, -1)));
        System.out.println(" *** One Pass Hashtable **");
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, -3, 3, 7}, -1)));
    }

}

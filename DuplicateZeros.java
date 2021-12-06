import java.util.Arrays;

public class DuplicateZeros {
    /*
     ** Input: arr = [1,0,2,3,0,4,5,0]
     **      Output: [1,0,0,2,3,0,0,4]
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
     ** Note that elements beyond the length of the original array are not written.
     **  Do the above modifications to the input array in place and do not return anything.
     */
    public static void main(String[] args) {
        int[] numbers = new int[]{1,0,2,3,0,4,5,0};
        new DuplicateZeros().duplicateZeros(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public  void duplicateZeros(int[] arr) {
        // We will start 2 pointer, one from the array length and one from the new array which needs
        // to be shifted to the j
        int numberOfZeros = 0;
        for (int num : arr) {
            if (num == 0) {
                numberOfZeros++;
            }
        }
        int j = (arr.length - 1) + numberOfZeros;
        int i = (arr.length) - 1;

        while (i != j) {
            insert(arr, i, j--);
            // if current element is zero , perform the operation
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            // decrement the i pointer
            i--;
        }
    }

    private void insert(int[] arr, int i, int j) {
        // check for array index out of bounds condition
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
}

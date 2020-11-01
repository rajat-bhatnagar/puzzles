public class FindMaxConsecutiveOnesInBinaryArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,1,1};
        System.out.println("Maximum number of consecutive 1s is - "+findMaxConsecutive1s(nums));
    }

    private static int findMaxConsecutive1s(int[] nums) {
      int current = 0;
      int max = 0;
      for (int i : nums){
        if (i == 1){
          current++;
        } else {
          if (current > max){
            max = current;
          }
          if ( max >= nums.length /2){
            return max;
          }
          current = 0;
        }
      }
      return Math.max(max, current);
    }
}

class FindMaxElementInAnIncreasingDecreasingArray {
  public static void main(String[] args) {
      int[] numbers = {100, 200, 300, 20, 3, 3, 200, 300}; 
      System.out.print("Max : - "+findMaxElementInAnIncreasingDecreasingArray(numbers));

      int[] numbersA = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1}; 
      System.out.print("Max : - "+findMaxElementInAnIncreasingDecreasingArray(numbersA));

      int[] numbersB = {1, 3, 50, 10, 9, 7, 6};
      System.out.print("Max : - "+findMaxElementInAnIncreasingDecreasingArray(numbersB));

      int[] numbersC = {10, 20, 30, 40, 50};
      System.out.print("Max : - "+findMaxElementInAnIncreasingDecreasingArray(numbersC));

      int[] numbersD = {120, 100, 80, 20, 0};
      System.out.print("Max : - "+findMaxElementInAnIncreasingDecreasingArray(numbersD));
  }

  private static int findMaxElementInAnIncreasingDecreasingArray(int[] numbers) {
    int max = numbers[0];
    for( int i = 0; i < numbers.length; i++){
      if (numbers[i] > max){
        max = numbers[i];
      } 
    }
    return max;
  }

}
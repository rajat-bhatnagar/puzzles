public class CountNumberOfDigits {

    private int countNumberOfDigits(int number) {
        String str = String.valueOf(Math.abs(number));
        return str.length();
    }

    private int countNumberOfEvenDigitsInArr(int[] numbers) {
        int count = 0;
        int numberOfDigits;
        for (int number : numbers) {
            // if number is non-negative - then Math. absolute value is not required
            numberOfDigits = String.valueOf(Math.abs(number)).length();
            if (numberOfDigits % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountNumberOfDigits obj = new CountNumberOfDigits();
        System.out.println("Number of digits : " + obj.countNumberOfDigits(0));
        System.out.println("Number of digits : " + obj.countNumberOfDigits(-12));
        System.out.println("Number of digits : " + obj.countNumberOfDigits(1));
        System.out.println("Number of digits : " + obj.countNumberOfDigits(12));
        System.out.println("Number of digits : " + obj.countNumberOfDigits(1234));
        System.out.println("Number of digits : " + obj.countNumberOfDigits(12345));
        System.out.println("Number of digits : " + obj.countNumberOfDigits(123456));
        System.out.println("Number of digits : " + obj.countNumberOfDigits(1234567));

        System.out.println("Number of digits : " + obj.countNumberOfEvenDigitsInArr(new int[]{1, 2, 3}));
        System.out.println("Number of digits : " + obj.countNumberOfEvenDigitsInArr(new int[]{1, 22, 33333, 44, 22}));
        System.out.println("Number of digits : " + obj.countNumberOfEvenDigitsInArr(new int[]{1, 2, 333333, 66}));
    }
}

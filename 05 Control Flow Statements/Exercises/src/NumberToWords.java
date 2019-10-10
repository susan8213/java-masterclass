public class NumberToWords {

    public static void numberToWords(int number) {
        int digitCount = getDigitCount(number);
        if (digitCount == -1)
            System.out.println("Invalid Value");
        else {
            int reversed = reverse(number);
            int reversedDigitCount = getDigitCount(reversed);
            do {
                int lastDigit = reversed % 10;
                switch (lastDigit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                }

                reversed /= 10;
            } while (reversed != 0);

            int zeroCount = digitCount - reversedDigitCount;
            while (zeroCount > 0) {
                System.out.println("Zero");
                zeroCount--;
            }
        }
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }

        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }

        if (isNegative)
            return -reversed;
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;

        int count = 0;
        do {
            count ++;
            number /= 10;
        } while (number != 0);

        return count;
    }
}

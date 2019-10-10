public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        boolean isLastDigit = true;
        int lastDigit = 0;
        int sum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (isLastDigit) {
                sum += lastDigit;
                isLastDigit = false;
            }

            number /= 10;
        }

        sum += lastDigit;
        return sum;
    }
}

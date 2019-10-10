public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (num1 != 0) {
            int temp = num2;
            int lastDigit1 = num1 % 10;
            while (temp != 0) {
                int lastDigit2 = temp % 10;
                if (lastDigit1 == lastDigit2)
                    return true;

                temp /= 10;
            }

            num1 /= 10;
        }

        return false;
    }
}

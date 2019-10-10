public class Main {

    public static void main(String[] args) {

        // switch case
        NumberInWord.printNumberInWord(10);
        System.out.println("NumberOfDaysInMonth: " + NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println("NumberOfDaysInMonth: " + NumberOfDaysInMonth.getDaysInMonth(1, -2020));

        // for-loop
        System.out.println("SumOddRange: " + SumOddRange.sumOdd(13, 13));

        // while-loop
        System.out.println("NumberPalindrome: " + NumberPalindrome.isPalindrome(-1221));
        System.out.println("FirstLastDigitSum: " + FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println("EvenDigitSum: " + EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("SharedDigit: " + SharedDigit.hasSharedDigit(9, 99));
        System.out.println("LastDigitChecker: " + LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println("GreatestCommonDivisor: " + GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        FactorPrinter.printFactors(81);
        System.out.println("PerfectNumber: " + PerfectNumber.isPerfectNumber(28));
        NumberToWords.numberToWords(1010);
        System.out.println("NumberToWords.getDigitCount(): " + NumberToWords.getDigitCount(5200));
        System.out.println("NumberToWords.reverse(): " + NumberToWords.reverse(-100));


    }
}

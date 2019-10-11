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

        // parse value
        System.out.println("FlourPacker: " + FlourPacker.canPack(1, 0, 4));
        System.out.println("FlourPacker: " + FlourPacker.canPack(1, 0, 5));
        System.out.println("FlourPacker: " + FlourPacker.canPack(0, 5, 4));
        System.out.println("FlourPacker: " + FlourPacker.canPack(2, 2, 11));
        System.out.println("FlourPacker: " + FlourPacker.canPack(-3, 2, 12));
        System.out.println("LargestPrime 21: " + LargestPrime.getLargestPrime(21));
        System.out.println("LargestPrime 217: " + LargestPrime.getLargestPrime(217));
        System.out.println("LargestPrime 0: " + LargestPrime.getLargestPrime(0));
        System.out.println("LargestPrime 45: " + LargestPrime.getLargestPrime(45));
        System.out.println("LargestPrime -1: " + LargestPrime.getLargestPrime(-1));
        System.out.println("DiagonalStar: ");
        DiagonalStar.printSquareStar(8);


    }
}

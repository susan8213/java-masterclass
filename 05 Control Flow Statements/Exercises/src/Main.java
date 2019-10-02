public class Main {

    public static void main(String[] args) {

        // switch case
        NumberInWord.printNumberInWord(10);
        System.out.println("NumberOfDaysInMonth: " + NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println("NumberOfDaysInMonth: " + NumberOfDaysInMonth.getDaysInMonth(1, -2020));

        // for-loop
        System.out.println("SumOddRange: " + SumOddRange.sumOdd(13, 13));

    }
}

public class Main {

    public static void main(String[] args) {

        SpeedConverter.printConversion(95.75);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2048);
        System.out.println("BarkingDog: " + BarkingDog.shouldWakeUp(true, 8));
        System.out.println("LeapYear: " + LeapYear.isLeapYear(2020));
        System.out.println("DecimalComparator: " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.1755));
        System.out.println("EqualSumChecker: " + EqualSumChecker.hasEqualSum(1, -1, 0));
        System.out.println("TeenNumberChecker: " + TeenNumberChecker.hasTeen(23, 15, 42));

        System.out.println("AreaCalculator: " + AreaCalculator.area(5.0));
        System.out.println("AreaCalculator: " + AreaCalculator.area(5.0, 4.0));
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        IntEqualityPrinter.printEqual(1,3,2);
        System.out.println("PlayingCat: " + PlayingCat.isCatPlaying(true, 45));

    }
}

public class MinutesToYearsDaysCalculator {

    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_MESSAGE);
            return;
        }

        long years = minutes / (60 * 24 * 365);
        long days = (minutes - years * (60 * 24 * 365)) / (60 * 24);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

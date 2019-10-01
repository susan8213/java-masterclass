package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALID_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes <0 || (seconds < 0 || seconds > 59))
            return INVALID_VALID_MESSAGE;

        long hours = minutes / 60;
        minutes %= 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0)
            return INVALID_VALID_MESSAGE;

        long minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }
}

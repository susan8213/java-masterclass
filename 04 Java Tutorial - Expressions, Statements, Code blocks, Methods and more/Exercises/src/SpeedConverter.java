import static java.lang.Math.round;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        return round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

}

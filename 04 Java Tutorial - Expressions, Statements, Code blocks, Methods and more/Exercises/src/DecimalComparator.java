public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        return castToThreeDecimalPlaces(number1) == castToThreeDecimalPlaces(number2);
    }

    public static double castToThreeDecimalPlaces(double number) {
        if (number < 0)
            number = Math.ceil(number * 1000.0) / 1000.0;
        else
            number = Math.floor(number * 1000.0) / 1000.0;

        return number;
    }
}

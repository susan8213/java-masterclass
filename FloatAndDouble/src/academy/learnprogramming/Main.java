package academy.learnprogramming;

/*
    float: single precision (32 bits)
    double: double precision (64 bits)
 */

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;  // May use 'f' at the end of number, since 5.25 here literally is double type
        double myDoubleValue = 5.25d;

        float myFloatValue2 = 5f;
        double myDoubleValue2 = 5d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue2);
        System.out.println("myDoubleValue = " + myDoubleValue2);

        // Double is more common to use than Float
        int myIntValue3 = 5 / 3;
        float myFloatValue3 = 5 / 3f;
        double myDoubleValue3 = 5 / 3.0;
        System.out.println("myIntValue = " + myIntValue3);
        System.out.println("myFloatValue = " + myFloatValue3);
        System.out.println("myDoubleValue = " + myDoubleValue3);

        // Quick Challenge
        double pounds = 5;
        double kilograms = 0.45359237 * pounds;
        System.out.println(pounds + " pounds equals to " + kilograms + " kilograms.");

        // Literally display Double
        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890;
    }
}

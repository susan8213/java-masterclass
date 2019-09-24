package academy.learnprogramming;

/*
    String: not a primitive type, it is a class.
       When I said you can delete characters out of a String, that's not strictly true.
       Strings in Java are immutable. That means you can't change a String after it's created.
       Instead, what happens is a new String is created.
    Better way: StringBuffer (learn this from future lesson)
 */

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";  // Use \" for String
        System.out.println("myString is equal to " + myString);

        myString += ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString += "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);

        // Java will convert number value to String.
        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.49d;
        lastString += doubleNumber;  // Not append to the same String, but create a new String with doubleNumber.
        System.out.println("LastString is equal to " + lastString);
    }
}

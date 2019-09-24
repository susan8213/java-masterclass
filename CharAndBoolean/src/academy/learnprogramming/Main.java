package academy.learnprogramming;

/*
    char: 16 bits
    unicode: encoding standard, which can symbolize 65535 type of characters
        for more detail, please refer to https://unicode-table.com
    boolean: true or false
 */

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';  // use \' for char to save one character, \" for String to save characters
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;  // common naming for boolean variable

    }
}

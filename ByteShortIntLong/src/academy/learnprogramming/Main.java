package academy.learnprogramming;

/*
    Package
    Primitive Types
    Size of Primitive Types and Width
        Byte: 8 bits
        Short: 16 bits
        Integer: 32 bits
        Long: 64 bits
    Casting
 */


public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // Wrapper classes
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Overflow and Underflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // You can use "_" to display large number more clearly for option.
        int myMaxIntTest = 2_147_483_647;
        // Error: Integer too large
        // int myMaxIntTest2 = 2_147_483_648;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // You have to add "L" at the end of value to demonstrate that the value is long type not int type.
        long myLongValue = 100;
        long bigLongLiteralValue = 2_147_483_647_234L; // You may get error without L here.
        System.out.println(bigLongLiteralValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // Casting
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2); // 2 is int type
        short myNewShortValue = (short) (myMinShortValue / 2);

        // Primitive Types Challenge
        byte myByteChallengeValue = 2;
        short myShortChallengeValue = 5;
        int myIntChallengeValue = 10;
        long myLongTotal = 50000 + 10 * (myByteChallengeValue + myShortChallengeValue + myIntChallengeValue);
        short myShortTotal = (short)
                (50000 + 10 * (myByteChallengeValue + myShortChallengeValue + myIntChallengeValue));
        System.out.println(myLongTotal);
        System.out.println(myShortTotal);
    }
}

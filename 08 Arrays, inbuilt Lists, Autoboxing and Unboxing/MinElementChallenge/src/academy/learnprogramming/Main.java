package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name MinElementChallenge

 */

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Please enter the length of the integer array: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(number);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("The minimum value of the array is " + findMin(array));

    }

    public static int[] readIntegers(int number) {
        int[] array = new int[number];
        while (number > 0) {
            System.out.print("Please enter array element #" + (array.length-number+1) + " value: ");
            array[array.length-number] = scanner.nextInt();
            scanner.nextLine();

            number--;
        }

        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min)
                min = value;
        }

        return min;
    }
}

package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myIntArray = getIntegers(5);
        System.out.println("Original array: ");
        printArray(myIntArray);
        System.out.println("Sorted array: ");
        printArray(sortIntegers(myIntArray));

    }

    public static int[] getIntegers(int number) {

        System.out.println("Enter "  + number + " integer: ");
        int[] array = new int[number];
        while(number > 0) {
            if(scanner.hasNextInt()) {
                array[array.length-number] = scanner.nextInt();
                scanner.nextLine();
                number--;
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {

        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j< array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}

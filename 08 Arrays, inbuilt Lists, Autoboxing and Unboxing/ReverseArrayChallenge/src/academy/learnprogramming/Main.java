package academy.learnprogramming;

import java.util.Arrays;

/*
-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name ReverseArrayChallenge
 */

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("Array: " + Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        for(int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}

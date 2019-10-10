package academy.learnprogramming;

/*
    while loop: checks the condition at the start before executing the block.
    do while loop: the code block is executed at once and then the condition is checked.
    Be careful with conditions, it is easy to end up with endless loop.
 */

public class Main {

    // TRY "count = 5;" and see what will happen in following 3 use cases.
    public static void main(String[] args) {

//        for(int count=0; count<5; count++) {
//            System.out.println("Count value is " + count);
//        }

        // 1. while-loop
	    int count = 0;
	    while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

	    // 2. Infinite while-loop using break
	    // Take notice if "while" is infinite
	    count = 0;
	    while(true) {
	        if(count == 5) {
	            break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

	    // 3. do-while
	    count = 0;
	    do {
            System.out.println("Count value is " + count);
            count++;
        } while(count != 5);

	    // Challenge
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        System.out.println("******************");
        number = 4;
        count = 0;
        while(count < 5) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            count++;
        }
        System.out.println("Total even numbers found = " + count);

    }

    // Challenge
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is an even number or not.
    // return true if an even number, otherwise return false;
    private static boolean isEvenNumber(int number) {
        return ((number % 2) == 0);
    }
}

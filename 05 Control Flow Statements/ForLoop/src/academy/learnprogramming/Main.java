package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        // for(init; termination; increment) {}
        // String format double with 2 decimal places
        for (int i=2; i<=5; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",
                    calculateInterest(10000.0, i)));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        System.out.println("*******************");
        for (int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",
                    calculateInterest(10000.0, i)));
        }

        // Challenge
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        System.out.println("*******************");
        int count = 0;
        for (int i = 100; i < 10000; i+=3) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
            }

            if (count > 2) {
                System.out.println("Exiting for loop");
                break;
            }

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate/100);
    }

    public static boolean isPrime(int n) {

        if (n == 1)
            return false;

        for (int i=2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}

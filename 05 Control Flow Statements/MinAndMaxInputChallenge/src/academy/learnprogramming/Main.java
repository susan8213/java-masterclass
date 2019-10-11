package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(true) {
            System.out.println("Enter number:");
            if(!scanner.hasNextInt()){
                break;
            }

            int num = scanner.nextInt();
            scanner.nextLine();

            if (num > max)
                max = num;
            else if (num < min)
                min = num;

        }

        System.out.println("Max = " + max + ", Min = " + min);
        scanner.close();
    }
}

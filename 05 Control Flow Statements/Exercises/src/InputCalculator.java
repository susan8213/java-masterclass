import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count ++;
            } else {
                break;
            }

            scanner.nextLine();
        }

        long avg;
        if (count == 0)
            avg = 0;
        else
            avg = Math.round(sum / (double) count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}

public class IntEqualityPrinter {

    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void printEqual(int x, int y, int z) {

        if (x < 0 || y < 0 || z < 0) {
            System.out.println(INVALID_MESSAGE);
            return;
        }

        if (x == y && y == z)
            System.out.println("All numbers are equal");
        else if (x != y && y != z && z != x)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}

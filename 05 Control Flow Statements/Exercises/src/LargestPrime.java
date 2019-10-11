public class LargestPrime {

    public static int getLargestPrime(int number) {

        int factor = number;
        while(factor > 1) {
            if(number % factor == 0){
                boolean isPrime =true;
                int factor2 = (int) Math.sqrt(factor);
                while(factor2 > 1){
                    if(factor % factor2 == 0){
                        isPrime = false;
                        break;
                    }

                    factor2--;
                }

                if(isPrime)
                    return factor;
            }
            factor--;
        }
        return -1;
    }

    public static int getLargestPrime2(int number) {

        int factor = number;
        while(factor > 1) {
            if((number % factor == 0) && isPrime(factor))
                return factor;

            factor--;
        }
        return -1;
    }

    private static boolean isPrime(int number) {
        int factor = (int) Math.sqrt(number);
        while (factor > 1) {
            if(number % factor == 0)
                return false;

            factor--;
        }
        return true;
    }
}

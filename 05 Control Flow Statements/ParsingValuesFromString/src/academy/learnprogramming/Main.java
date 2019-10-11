package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
	    // String numberAsString = "2018a";  // this statement to convert to integer will have error.
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);  // Integer is a wrapper class
        System.out.println("number = " + number);

        numberAsString += 1;  // automatically convert "1" to string type and append it to original string.
        number += 1;
        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number = " + number);

        double number2 = Double.parseDouble(numberAsString);
        System.out.println("number2 = " + number2);

    }
}

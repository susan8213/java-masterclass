package academy.learnprogramming;

/*
    Operators, Operands, Expressions
    Abbreviating Operators
    if-then Statement
    Logical and Operator
    Logical OR Operator
        &&: logical AND
        ||: logical OR
        & and |: bitwise operator working at the bit level
    Assignment Operator VS Equals to Operator
    Ternary Operator: shortcut to assigning one of two values to variable
    Operator Precedence
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
    http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
 */

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;  // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;  // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;  // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++;  // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result - 1;
        result -= 1;  // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        // result = result * 10;
        result *= 10;  // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // result = result / 5;
        result /= 5;  // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // result = result % 3;
        result %= 3;  // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // if-then statement
        boolean isAlien = false;
        if (isAlien == true)  // add ; end at the if-then would end the statement and println
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");  // It will print this string, we should add "code block"

        if (isAlien == false) {  // code block
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        // Logical and Operator
        int topScore = 80;
        if (topScore < 100) {  // try to change operator to "==", "!=", ">", ">=", "<", "<="
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Logical OR Operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // Assignment Operator VS Equals to Operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error \"if (newValue = 50)\" , int cannot be converted to boolean");
            System.out.println("This is correct \"if (newValue == 50)\"");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }
        if (isCar == true) {  // also try "isCar == true", "isCar != true", "!isCar", "isCar" (last two are abbreviated forms)
            System.out.println("This is correct isCar equals to true");
        }

        // Ternary Operator
        // 1st operand isCar: condition
        // 2nd operand true: wasCar equals to true when the condition is true
        // 2nd operand false: wasCar equals to false when the condition is false
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge
        double val1 = 20.0;
        double val2 = 80.0;
        double challengeResult = (val1 + val2) * 100;
        boolean isResultZero = ((challengeResult % 40) == 0);
        System.out.println("challengeResult % 40 equals to zero -> " + isResultZero);
        if (!isResultZero) {
            System.out.println("Got some remainder");
        }

    }
}

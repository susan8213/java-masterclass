package academy.learnprogramming;

/*
    Methods
 */

public class Main {

    public static void main(String[] args) {
        // The commented codes are the previous project code that you can see there are duplicated codes.
        // Use variable as input of the method, to make it easy to read and check the value of the inputs

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        /*
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
         */

        calculateScore(gameOver, score, levelCompleted, bonus);
        int highScore = returnCalculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was " + highScore);


        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        /*
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        */

        calculateScore(gameOver, score, levelCompleted, bonus);


        // Challenge
        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".

        // Create a 2nd method called calculateHighScorePosition
        // it should be set one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and <1000
        // 3 if the score is >=100 and <500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50

        String playerName = "Tim";
        int playerScore = 1500;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));

        playerScore = 900;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));
        playerScore = 400;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));
        playerScore = 50;
        displayHighScorePosition(playerName, calculateHighScorePosition(playerScore));

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static int returnCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {


//        if (score >= 1000)
//            return 1;
//        else if (score >= 500)
//            return 2;
//        else if (score >= 100)
//            return 3;
//        else
//            return 4;


        // Anther way
        int position = 4;
        if (score >= 1000)
            position = 1;
        else if (score >= 500)
            position = 2;
        else if (score >= 100)
            position = 3;

        return position;
    }
}

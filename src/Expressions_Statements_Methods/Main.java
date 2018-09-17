package Expressions_Statements_Methods;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 8;
        int bonus = 200;


//        if (score < 5000 && score >1000) {
//            System.out.println("Your score was 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        // Demonstrating code-block accessibility => scope
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

                /*
Print out a second score on the screen with the following
score set to 10000
levelCompleted set to 8
bonus set to 200
But make sure the first printout above displays as well
 */
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}

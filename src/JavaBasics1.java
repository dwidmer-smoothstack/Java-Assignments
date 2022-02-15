import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaBasics1 {

    public static void main (String[] args) throws InputMismatchException {

        // ASSIGNMENT 1
        System.out.println("1)");
        for (int i = 1; i < 5; i++) {
            System.out.println("*".repeat(i));
        }
        System.out.println("2)");
        for (int i = 4; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
        System.out.println("3)");
        int pyramidSize = 4;
        int level = 1;
        for (int i = 0; i < pyramidSize; i++) {
            int numStars = 1 + (2*i);
            System.out.print(" ".repeat(pyramidSize-level++));
            System.out.print("*".repeat(numStars));
            System.out.println();
        }
        System.out.println("4)");
        level = 4;
        for (int i = pyramidSize; i > 0; i--) {
            int numStars = 1 + (2*(i-1));
            System.out.print(" ".repeat(pyramidSize-level--));
            System.out.print("*".repeat(numStars));
            System.out.println();
        }

        // ASSIGNMENT 2
        System.out.println("ASSIGNMENT 2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number from 1-100:");
        boolean valid = false;
        int number;
        int randNum = (int)(Math.random() * 99 + 1);
        int numGuesses = 0;
        do {
            try {
                number = scan.nextInt();
                if (number < 1 || number > 100) {
                    throw new InputMismatchException("Input must be a number between 1-100.");
                }
                if (number <= randNum + 10 && number >= randNum - 10) {
                    System.out.println("The correct number was "+ randNum + ". Good job!");
                    valid = true;
                } else {
                    if (++numGuesses >= 5){
                        System.out.println("Sorry. The number was " + randNum);
                        break;
                    }
                    throw new Exception("Wrong. Guess again!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!valid);
    }
}

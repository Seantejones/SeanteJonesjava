

import java.util.Scanner;
import java.util.Random;

public class RockPaperS {

    public static int score = 0;
    public static int numberofGames = 0;

    public static void main(String[] args) {

        String name = "";
        Scanner user = new Scanner(System.in);
        System.out.println("What is your name?");
        name = user.next();

        System.out.println("How many rounds would you like to play? 3/5");
        int rounds = user.nextInt();

        play();
        while (numberofGames < rounds) {
            play();
        }
    }

    public static void play() {
        String computer = computerChoice();
        String user = userChoice();
        determineWinner(computer, user);
    }

    public static String computerChoice() {
        Random r = new Random();
        int cinput = r.nextInt(3) + 1;
        String computer = "";
        if (cinput == 1)
            computer = "Rock";
        if (cinput == 2)
            computer = "Paper";
        if (cinput == 3)
            computer = "Scissors";
        return computer;
    }

    public static String userChoice() {
        Scanner user = new Scanner(System.in);
        String choice = "";
        System.out.println("Choose 'Rock', 'Paper', 'Scissors'");
        choice = user.next();
        return choice;
    }

    public static boolean playAgain() {
        System.out.println("Do you want to play again? y/n");
        String input = "";
        if (input.equals("y")) {
            return true;
        } else if (input.equals("n")) {
            return false;
        } else {
            System.out.println("Choose yes or no.");
            return playAgain();
        }
    }

    public static void determineWinner(String computer, String user) {
        numberofGames++;
        System.out.println("Computer chooses: " + computerChoice());
        System.out.println("You chose: " + userChoice());
        if (computer.equals("Rock") && user.equals("Paper")) {
            score++;
            System.out.println("You win! ");
            return;
        }
        if (computer.equals("Paper") && user.equals("Scissors")) {
            score++;
            System.out.println("You win!");
            return;
        }
        if (computer.equals("Scissors") && user.equals("Rock")) {
            score++;
            System.out.println("You win!");
            return;
        }
        if (computer.equals("Rock") && user.equals("Scissors")) {
            score--;
            System.out.println("You lose!");
            return;
        }
        if (computer.equals("Paper") && user.equals("Rock")) {
            score--;
            System.out.println("You lose!");
            return;
        }
        if (computer.equals("Scissors") && user.equals("Paper")) {
            score--;
            System.out.println("You lose");
            return;
        } else if (computer.equals(user)) {
            System.out.println("Its a tie! ");
        } System.out.println("We have played " + numberofGames + " and you have won " + score);
        return;
    }
}
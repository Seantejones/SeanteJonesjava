/* Seante Jones
AP Computer Science A
Period 1
November 29, 2018
Roll Dice Project
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class rollDiceProject {
    public static final int DICENUM = 1;

    public static void main(String[] args) {
        defineDice();
        System.out.println("Define Dice");

        String play = "y";
        Scanner user = new Scanner(System.in);
        System.out.println("Wanna play again y/n");
        play = user.next();

        while (play.equals("y")) {
            rollDice();
            System.out.println(rollDice());
            printDice();
            drawLine();
            System.out.println("Do you want to roll again? (Y or N");
            play = user.next();

        }
    }


        public static void defineDice() {
            String dice[][] = new String[6][5];
            for (int i = 0; i <= dice.length; i++) {
                String top = "\n-------";
                String two = "\n|*     |";
                String three = "\n|  *  |";
                String four = "\n|    *|";
                String five = "\n| * * |";
                String sides = "\n|     |";
                String die1 = top + sides + three + sides + top;
                String die2 = top + sides + five + sides + top;
                String die3 = top + two + three + four + top;
                String die4 = top + five + sides + five + top;
                String die5 = top + five + three + five + top;
                String die6 = top + five + five + five + top;
            }
        }
    String gameDice[][] = new String[DICENUM][DICENUM];


        public static int rollDice(){
            System.out.println("Roll Dice");
            int rollDice = (int)((Math.random()*6) +1);
            return rollDice;
        }
        public static void printDice(){
            System.out.println("Print Dice");

        }
        public static void drawLine(){
            System.out.println("Draw Line");

        }
    }



   /* String total =" ";        System.out.println("How many ");

    Scanner user = new Scanner(System.in);
        (int)(6.0 * Math.random() + 1);
        */
package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * switch instead of if-the-else-if
 * gets a users choice based on a menu
 * and returns a feedback.
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("please select one of the followin:");
            System.out.println("1. one player game");
            System.out.println("2. two player game");
            System.out.println("3. three player game");
            System.out.println("4. quit");
            System.out.println("please provide a choice");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("start one-player game");
                    break;
                case 2:
                    System.out.println("start two-player game");
                    break;
                case 3:
                    System.out.println("start team-player game");
                    break;
                case 4:
                    System.out.println("quit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }

        } while (choice != 4);

        System.out.println("Goodbye");
    }
}

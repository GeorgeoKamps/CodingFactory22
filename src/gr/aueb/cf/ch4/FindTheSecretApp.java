package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * o xristis exei 10 eukairies gia na vrei
 * ena mystiko kleidi (arithmo). an to vrei
 * nvritera apo thn 10h fora, h for tha prepei
 * na stamathsei (break)
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No worries, play again");
            System.exit(1);
        }

        System.out.println("Success! Play again!");

    }
}

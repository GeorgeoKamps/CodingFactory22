package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * lineorizes if-then-else.
 */
public class LinearBingoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET_KEY = 17;

        while (true) {
            System.out.println("please provide a num");
            num = in.nextInt();

            if (num != SECRET_KEY) {
                System.out.println("please try again");
                continue;
            }

            System.out.println("Bingo");
            break;
        }

    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * apofasizei an ena etos einai disekto (leap year),
 * opou disekto simainei to etos na diaireitei me to 4,
 * na min diaireitai me to 100, kai an diaireitai me to 100
 * na diaireitai kei me to 400.
 *
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        boolean isLeap = false;

        System.out.println("Please provide a year (int) :");
        year = in.nextInt();

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeap = true;
            } else if (year % 400 == 0) {
                isLeap = true;

            }
        }
    }
}

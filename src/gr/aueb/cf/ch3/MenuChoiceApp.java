package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * emfanizei ena menu kai o xrhsths
 * dinei mia epilogi kai lamvanei ena
 * antistoixo feedback/confirmation
 */
public class MenuChoiceApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλεξτε ενα απο τα παρακατω:");
            System.out.println("1.εισαγωγη");
            System.out.println("2. ενημερωση");
            System.out.println("3. διαγραφη");
            System.out.println("4. αναζητηση");
            System.out.println("εξοδος");

            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Μη εγκυρη επιλογη");
            }

            if (choice == 5) {
                System.out.println("Επιλεξατε εξοδο");
            }

            if (choice ==1 ) {
                System.out.println("Επιλεξατε εισαγωγη");
            } else if (choice == 2) {
                System.out.println("Επιλεξατε ενημερβση");
            } else if (choice == 3) {
                System.out.println("Επιλεξατε διαγραφη");
            } else {
                System.out.println("Επιλεξατε αναζητηση");
            }
        } while (choice != 5);
    }
}

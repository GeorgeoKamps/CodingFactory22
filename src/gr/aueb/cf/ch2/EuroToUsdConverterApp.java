package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * convert euros to dollars (usa)
 * Λαμβανει απο το χρηστη (stdin) εναν ακεραιο
 * που συμββολιζει το ποσο σε euros και μετατρεπει
 * σε δολαρια και εμφανιζει το τελικο αποτελεσμα.
 */
public class EuroToUsdConverterApp {
    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars =0;
        int usaCents =0;
        final int PARITY = 99;

        // εντολες
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents =inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //εκτυπωση αποτελεσματων
        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents );


    }
}

package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * Διαβαζει απο το std input (πληκτρολογιο)
 * 2 ακαιραιους και τους προσθετει
 */

public class ScannerApp {
    public static void main(String[] args) {
        //Δηλωση μεταβ και αρχικοποιηση
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // εντολες
        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // εκτυπωση αποτελεσματων
        System.out.printf("%d + %d = %d", num1, num2, sum);

    }
}

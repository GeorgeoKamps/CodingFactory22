package gr.aueb.cf.ch1;

import java.util.Arrays;

/**
 * Προσθετει 2 ακεραιους
 * και εμφανιζει το αποτελεσμα στη οθονη.
 */
public class AddApp {
    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        //Εντολες
        result = num1 + num2;


        //Εκτυπωση αποτελεσματων
        System.out.println("Το αποτέλεσμα είναι : " + result);
        System.out.printf("To αποτελεσμα των %d, %d ειναι %d",num1, num2, result);

    }
}

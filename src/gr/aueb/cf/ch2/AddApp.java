package gr.aueb.cf.ch2;

import java.beans.PropertyEditorSupport;

/**
 * overflow.
 */

public class AddApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        //Εντολες
        result = num1 + num2;


        //Εμφανιση αποτελεσματων
        System.out.println("Sum: "+ result);
    }
}

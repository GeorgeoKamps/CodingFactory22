package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασιζει αν χιονιζει με βαση
 * την θερμοκρασια .Αν η θερμοκρασια
 * ειναι <0, τοτε χιονιζει , αλλιως δεν
 * χιονιζει. Ο χρηστης δινει την θερμοκρασια.
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);
        System.out.println("Is snowing: "+ isSnowing);
    }
}

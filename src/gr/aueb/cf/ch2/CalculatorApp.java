package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρηστης δινει 2 ακεραιους
 * και υπλογιζει τα +, -, /, %
 */

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();


        System.out.println("sum: " + (num1 + num2));
        System.out.println("sub: " + (num1 - num2));
        System.out.println("mul: " + (num1 * num2));
        System.out.println("div: " + (num1 / num2));
        System.out.println("mod: " + (num1 % num2));

    }
}

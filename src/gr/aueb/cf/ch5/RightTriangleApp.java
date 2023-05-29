package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * lamvanei 3 times double apo ton xristi, tis
 * a, b, c opou a einai i ypoteinousa kai
 * b,c oi 2 plevres.
 *
 * elegxei an to trigwno einai orthogwnio, dld
 * a^2 == b^2 + c^2
 *
 * estw epsilon = 0.000005
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert a, b, c");

        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON) {
            System.out.println("Ορθογώνιο");
        } else {
            System.out.println("οχι ορθωγώνιο");
        }
    }
}

package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * diavazw apo stdin to
 * start value, end value, step
 * kai ektypwnei to plithos twn
 * epanalipsewn.
 */
public class ForFlexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startVal;
        int endValue ;
        int step ;
        int iterations = 0;

        System.out.println("Provide start, end and step values");
        startVal = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startVal; i <= endValue; i = i + step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println("Iterations: " + iterations);
    }
}

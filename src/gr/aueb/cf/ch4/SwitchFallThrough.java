package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * lamvanei ena grade apo ton xristi
 * kai dinei feedback (excellent, v.good, good, fail)
 * an einai grade >=9, >=7, >=5, <5 antistoixa
 */
public class SwitchFallThrough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;

        System.out.println("Please provide the grade");
        grade = in.nextInt();

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("fail");
                break;
            case 5:
            case 6:
                System.out.println("good");
            case 7:
            case 8:
                System.out.println("very good");
                break;
            case 9:
            case 10:
                System.out.println("excellent");
                break;
            default:
                System.out.println("error in grade");
                break;
        }
    }
}

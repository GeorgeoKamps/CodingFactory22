package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * enas mikros batraxos thelei na perasei ena potami.
 * o frog brisketai sth thesi X kai thelei na ftasei
 * sth thesi Y ( h se thesi > Y). O frog jumps a fixed distance,
 * D.
 *
 * Briskei to elaxisto aritho jumps pou o frog prepei na kanei
 * wste na ftasei sto stoxo tou (h na ton kseperasei)
 *
 * p.x :
 * x=10
 * y=85
 * d=30
 *
 * tote o frog tha xreiastei 3 jumps, giati
 * starts at 10, kai meta to prwto jump paei sti thesi
 * 10 + 30 = 40.
 * sto deytero jump paei 40+30=70.
 * sto 3o jump paei 70+30=100.
 */
public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;
        int y;
        int d;
        int jumps = 0;

        System.out.println("Please insert x, y, d");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();


        for ( int i = x; i <= y; i = i + d) {
            jumps++;
        }
        System.out.println("The number of jumps you need is  : " + jumps);
    }
}

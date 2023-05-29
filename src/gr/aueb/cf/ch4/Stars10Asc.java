package gr.aueb.cf.ch4;

/**
 * ektypwnei se auksousa seira
 * 1,2,3.. 10 asterakia se kathe grammi
 */
public class Stars10Asc {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();

        }
    }
}

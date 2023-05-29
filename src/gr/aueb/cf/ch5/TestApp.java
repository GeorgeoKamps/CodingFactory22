package gr.aueb.cf.ch5;

public class TestApp {
    public static void main(String[] args) {

        int i = 1;
        int result = 1;

        do {
            result = result + i;
            i++;
        } while ((i >= 1) && (result <= 2));

        System.out.println(result);



    }
}
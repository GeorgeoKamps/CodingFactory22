package gr.aueb.cf.ch4;

public class FrogApp2 {
    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y =85;
        int jmp= 30;

        jumps = (int) Math.ceil((y-x) / (double) jmp);

        System.out.println("Jumps: " + jumps);
    }

}

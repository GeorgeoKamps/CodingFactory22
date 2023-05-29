package gr.aueb.cf.ch7;
/**
   replace a string (replace tab with -.)
 */
public class ReplaceApp {
    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashedTitle;


        dashedTitle = title.replace(" ", "-");
        System.out.println(dashedTitle);
    }
}

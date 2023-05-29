package gr.aueb.cf.ch6;

public class getMaxPosition {
    public static void main(String[] args) {
        int [] arr = {5, 3, 6, 8, 2};

        int maxPosition = 0;
        int maxValue = arr[maxPosition];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue ) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        System.out.printf("Max Value: %d, Max Position: %d", maxValue, maxPosition );
    }
}

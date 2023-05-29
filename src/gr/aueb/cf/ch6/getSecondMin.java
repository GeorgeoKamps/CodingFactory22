package gr.aueb.cf.ch6;

public class getSecondMin {
    public static void main(String[] args) {
        int[] arr = {0, 2, 10, 3, -3};


        int minPosition = 0;
        int minPosition2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    minPosition = arr[i];
                    if (arr[j] < minPosition2) {
                        minPosition2 = arr[j];
                    }
                }
            }

        }

        System.out.println("The smallest element is: " + minPosition + "\n" + "The second smallest element is: " + minPosition2);


    }
}
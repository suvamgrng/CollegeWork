package WeekTwenty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 2 ,9, 1};
        System.out.println("Unsorted array: " + Arrays.toString(array));
        for ( int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

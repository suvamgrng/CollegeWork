package Week27;

import java.util.Arrays;
import java.util.Scanner;
/**Bubble Sort*/
public class BubbleSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] numbers = {0};
            int temp;
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }


            System.out.print("Before: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
//            System.out.println();
//
//            for (int i = 0; i < numbers.length - 1; i++) {    //Run to lenght-1 times
//
//                for (int j = 0; j < numbers.length - i - 1; j++) {
//
//                    if (numbers[j] > numbers[j + 1]) {
//                        temp = numbers[j];
//                        numbers[j] = numbers[j + 1];
//                        numbers[j + 1] = temp;
//                    }
//                }
//            }
//        }
//
//
//        System.out.print("After: ");
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }

        }
    }
}

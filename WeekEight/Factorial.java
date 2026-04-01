package WeekEight;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 class Factorial {
    
    public static void main(String[] args) {
        String[] firstName = {"asd fg"};
        String add = " ";
        for (int i = 0; i < firstName.length; i++) {
            add += firstName[i];
        }

        String[] words = add.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
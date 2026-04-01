package WeekEighteenNineteenClaude;

import WeekEight.Square;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");

        // The for-each loop
        for (String language : languages) {
            System.out.print(language);
        }
    }
}

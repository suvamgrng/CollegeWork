package WeekEighteenNineteenClaude;

import java.util.ArrayList;
import java.util.Arrays;

class Great {
    String name;
    int age;
    String hubby;

    public Great(String name, int age, String hubby) {
        this.name = name;
        this.age = age;
        this.hubby = hubby;
    }
    @Override
    public String toString() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nHubby: " + hubby;
    }
}
public class Arraylist {
    public static void main(String[] args) {
        Great great = new Great("Suvam Gurung", 19, "Coding");
        ArrayList<Great> languages = new ArrayList<>();
        languages.add(great);

        for (Great arr: languages) {
            System.out.println(arr);
        }
    }
}

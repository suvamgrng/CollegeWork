package WeekNine;


/**
 * Write a description of class Parrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parrot extends Bird {
    
    public void food() {
        System.out.println("Parrot eats food");
    }
    //@override
    public void eat() {
        System.out.println("Parrot can eat");
    }
public static void main(String[] args) {
    System.out.println('\u000C');
    Parrot parrot = new Parrot();
    parrot.eat();
    parrot.nature();
    parrot.food();
}
}
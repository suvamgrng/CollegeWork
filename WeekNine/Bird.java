package WeekNine;


/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird extends Aves{
    
    Bird() {
        System.out.println("This is a Constructor");
    }
    public void eat() {
        super.nature();
        System.out.println("Bird can eat");
    }
    
    public static void main(String[] args) {
        System.out.println('\u000C');
        Bird bird = new Bird();
        bird.eat();
        bird.nature();
    }
}
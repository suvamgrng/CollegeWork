package WeekNine;


/**
 * Write a description of class Eagle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eagle extends Bird{
    
    public void fly() {
        System.out.println("I can fly high");
    }
    
    public static void main(String[] args) {
        System.out.println('\u000C');
        Eagle eagle = new Eagle();
        eagle.nature();
        eagle.fly();
    }
}
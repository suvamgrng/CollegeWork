package WeekTwelve;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class ArrayListExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListExample {
    
    public static void main(String[] args) {
        System.out.println('\u000C');
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            a1.add(i);
        }
        //For each loop
        for (Integer i: a1) {
            System.out.println(i);
        }
        
        //Iterating array using iterator
        Iterator it = a1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
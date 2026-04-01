package WeekSeven;
import java.util.ArrayList;


/**
 * Write a description of class KhanaGharMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KhanaGharMenu {
    
    public static void main(String[] args) {
        System.out.println('\u000C');
        Menu item1 = new Menu("Dal-Bhat Set", 120, "Dal-Bhat", true, true);
        Menu item2 = new Menu("Masala Chiya", 70, "Chiya-Nasta", false, true);
        Menu item3 = new Menu("Dharane Kalo Bangur", 400, "Bangur Ko Masu", false, true);
        Menu item4 = new Menu("Sekuwa", 200, "bhaisi-Sekuwa", false, false);
        Menu item5 = new Menu("Momo", 140, "Veg", true, true);
        
        ArrayList<Menu> item = new ArrayList<>();
        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);
        item.add(item5);
        
        //Display formatted menu
        System.out.println("Item names in the Menu");
        System.out.println("----------------------");
        for (Menu m: item) {
            System.out.println(m);
            System.out.println();
        }
        
        //Display all vegetarian items only
        System.out.println("Vegetarian items");
        System.out.println("----------------");
        for (Menu m: item) {
            
            if (m.isVegetarian()) {
                System.out.println(m);
            }
            System.out.println();
        }
        
        //Display all non-vegetarian items only
        System.out.println("Non-vegetarian items");
        System.out.println("--------------------");
        for (Menu m: item) {
            
            if(!m.isVegetarian()) {
                System.out.println(m);
            }
            System.out.println();
        }
        
        //Display all non-vegetarian items with a price greater than Rs.100 and isAvailable = true)
        System.out.println("All non.vegetarian items with price > 100 & availability Status");
        System.out.println("---------------------------------------------------------------");
        for (Menu m: item) {
            
            if (!m.isVegetarian() && m.getPrice() > 100 && m.isAvailable()) {
                System.out.println(m);
            }
            System.out.println();
        }
        
        //Display all veg items with price less than Rs.50 and is available
        System.out.println("All vegetarian items with price < Rs.50 and is availabe");
        System.out.println("------------------------------------------------------");
        for (Menu m: item) {
            
            if (m.isVegetarian() && m.getPrice() < 50 && m.isAvailable()) {
                System.out.println(m);
            }
             System.out.println();
            }
    }
}
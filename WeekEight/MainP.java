package WeekEight;
import java.util.Scanner;

/**
 * Write a description of class MainP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainP {
    
    public static void main(String[] args) {
        System.out.println('\u000C');
        Product p = new Product();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
         
        int result = p.calculateProduct(num1, num2);
        System.out.println("The product " + "of " + num1 + "&" + num2 + " is: " + result);
    }
}
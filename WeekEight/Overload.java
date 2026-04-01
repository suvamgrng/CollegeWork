package WeekEight;


/**
 * Write a description of class Overload here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Overload {
    
    public int checkNumber(int num) {
        
        if (num > 0) {
            System.out.println("Positive");
            return 1;
        }
        
        else if (num < 0) {
            System.out.println("Negative");
            return -1;
        }
        
        else {
            System.out.println("Zero");
            return 0;
        }
    }
    
    public int checkNumber(int num, boolean checkEvenOdd) {
        
            if (num % 2 == 0) {
                System.out.println("Even");
                return 1;
            }
            
            else {
                System.out.println("Odd");
                return 0;
            }
        }
    }

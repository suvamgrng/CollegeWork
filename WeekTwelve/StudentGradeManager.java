package WeekTwelve;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class StudentGradeManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class StudentGradeManager {
    
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentList = new ArrayList<>();
        // Input student names and grades
        System.out.print("How many student grade you wanna give: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter students name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Grade Scored: ");
            String grade = scanner.nextLine();

            String studentInfo = name + "-" + grade;
            studentList.add(studentInfo);
        }

        // Display full list
        System.out.println("\n=== Full List ===");
        for (String student : studentList) {
            System.out.println(student);
        }

        // Count "A" grades
        int count = 0;
        for (String student : studentList) {
            String[] parts = student.split("-");
            if (parts[1].equals("A")) {
                count++;
            }
        }
        System.out.println("\nNumber of 'A' grades: " + count);

        // Remove one entry
        System.out.print("\nWhich student to remove (enter number 1-" + studentList.size() + "): ");
        int removeNum = scanner.nextInt();
        studentList.remove(removeNum - 1);

        // Display updated list
        System.out.println("\n=== Updated List ===");
        for (String student : studentList) {
            System.out.println(student);
        }

        scanner.close();
    }
}
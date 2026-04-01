package WeekTwentyTwo;

public class Main {
    public static void main(String[] args) {
        try {
            StudentModel student = new StudentModel("Suvam Gurung", 3.9);
            System.out.println("Student: " + student.getName());
            System.out.println("GPA: " + student.getGpa());
            System.out.println("Letter grade: " + student.getLetterGrade());

            System.out.println("Request B: " + student.requestGrade("B"));
            System.out.println("Request A: " + student.requestGrade("A"));
        } catch (InvalidGradeException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}

package Zzzz;

public class GPAValidator {

    public static double validateGPA(String input) {
        double gpa = Double.parseDouble(input);
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA out of range: " + gpa);
        }
        return gpa;
    }
    public static void main(String[] args) {
        String[] inputs = {"3.5", "5", "abc"};

            for (int i = 0; i < inputs.length; i++) {
                try {
                    System.out.println("Valid GPA: " + validateGPA(inputs[i]));
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid number format");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }


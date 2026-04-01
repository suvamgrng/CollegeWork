package WeekTwentyTwo;

public class StudentModel {
    private static final double MIN_GPA = 0.0;
    private static final double MAX_GPA = 4.0;

    private final String name;
    private final double gpa;

    public StudentModel(String name, double gpa) throws InvalidGradeException {
        this.name = validateName(name);
        this.gpa = validateGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getLetterGrade() {
        if (gpa >= 3.7) {
            return "A";
        } else if (gpa >= 3.0) {
            return "B";
        } else if (gpa >= 2.0) {
            return "C";
        } else if (gpa >= 1.0) {
            return "D";
        }
        return "F";
    }

    public String requestGrade(String requestedGrade) throws InvalidGradeException {
        String normalized = normalizeGrade(requestedGrade);
        double minGpa = minGpaForGrade(normalized);
        if (minGpa < 0.0) {
            throw new InvalidGradeException("Unknown grade request: " + requestedGrade);
        }
        if (gpa < minGpa) {
            throw new InvalidGradeException(
                    "Requested grade " + normalized + " is not possible for GPA " + gpa
            );
        }
        return normalized;
    }

    private static double minGpaForGrade(String grade) {
        switch (grade) {
            case "A":
                return 3.7;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return -1.0;
        }
    }

    private static String validateName(String name) throws InvalidGradeException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidGradeException("Student name must not be empty.");
        }
        return name.trim();
    }

    private static double validateGpa(double gpa) throws InvalidGradeException {
        if (Double.isNaN(gpa) || Double.isInfinite(gpa)) {
            throw new InvalidGradeException("GPA must be a real number.");
        }
        if (gpa < MIN_GPA || gpa > MAX_GPA) {
            throw new InvalidGradeException(
                    "GPA must be between " + MIN_GPA + " and " + MAX_GPA + "."
            );
        }
        return gpa;
    }

    private static String normalizeGrade(String requestedGrade) throws InvalidGradeException {
        if (requestedGrade == null) {
            throw new InvalidGradeException("Grade request must not be empty.");
        }
        String normalized = requestedGrade.trim().toUpperCase();
        if (normalized.isEmpty()) {
            throw new InvalidGradeException("Grade request must not be empty.");
        }
        return normalized;
    }
}
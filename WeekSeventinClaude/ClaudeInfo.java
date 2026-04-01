package WeekSeventinClaude;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class ClaudeInfo {
    private String name;
    private String course;
    private int studentID;

    public ClaudeInfo(String name, String course, int studentID) {
        this.name = name;
        this.course = course;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getIssueDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        return today.format(formatter);
    }

    public String getExpiryDate() {
        LocalDate today = LocalDate.now();
        LocalDate expiry = today.plusYears(4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        return expiry.format(formatter);
    }
}

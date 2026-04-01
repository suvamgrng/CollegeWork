package WeekSeventin;
/** Create a Studentclass that stores student information for the ID card. This class has
 no GUI code — it is pure data. **/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Student {
    /**
     * Private fields
     */
    private String studentName;
    private String studentId;
    private String programme;
    private int year;
    private String collegeName;

    /**
     *
     * @param studentName
     * @param studentId
     * @param programme
     * @param year
     * @param collegeName
     */
    public Student(String studentName, String studentId, String programme, int year, String collegeName) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.programme = programme;
        this.year = year;
        this.collegeName = collegeName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getProgramme() {
        return programme;
    }

    public int getYear() {
        return year;
    }

    public String getCollegeName() {
        return collegeName;
    }

    /**
     *
     * @return getters
     */


    public String getInitials() {
        String[] trimmedWord = this.studentName.trim().toUpperCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < trimmedWord.length; i++) {
            sb.append(trimmedWord[i].charAt(0));
        }
        return sb.toString();
    }

    public String toHTML() {
        LocalDate today = LocalDate.now();
        LocalDate expiry = today.plusMonths(6);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedToday = today.format(formatter);
        String formattedExpiry = expiry.format(formatter);

        return "<html>" +
                "<center>" +
                "<h2><b>College Name: " + collegeName + "</b></h2>" +
                "<hr>" +
                "<p><b>Student Name: " + studentName + " — (" + getInitials() + ")" + "</b></p>" +
                "<p>Student-ID: " + studentId + "</p>" +
                "<p>Programme: " + programme + " | Year: " + year + "</p>" +
                "<small style='font-size:7px'>Valid Date: " + formattedToday + " | Expiry Date: " + formattedExpiry + "</small>" +
        "</center></html>";
    }
}

package WeekSeventin;

public class CollegeInfo {
    /** Attributes
     *
     */
    private String collegeName;
    private String location;
    private String programmes;
    private String affiliation;
    private int studentCount;

    /** Constructor
     *
     * @param collegeName
     * @param location
     * @param programmes
     * @param affiliation
     */
    public CollegeInfo(String collegeName, String location, String programmes, String affiliation, int studentCount ) {
        this.collegeName = collegeName;
        this.location = location;
        this.programmes = programmes;
        this.affiliation = affiliation;
        this.studentCount = studentCount;
    }

    /** Methods
     *
     * @return
     */
    public String getCollegeName() {
        return collegeName;
    }

    public String getLocation() {
        return location;
    }

    public String getProgrammes() {
        return programmes;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String toHTML() {
        return "<html><div style='text-align: center'>" +
                "<hr>" +
                "<h2 style='color:#1a5276;'>College: " + getCollegeName() + "</h2>" +
                "<p>Location: " + getLocation() + "</p>" +
                "<p>Programmes: " + getProgrammes() + "</p>" +
                "<p>Affiliation: " + getAffiliation() + "</p>" +
                "<p><b>Total Students: " + getStudentCount() + "</b></p>" +
                "<hr>" +
                "</div></html>";
    }
}

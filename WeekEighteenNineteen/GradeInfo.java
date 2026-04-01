package WeekEighteenNineteen;

public class GradeInfo {
    /**
     * Private fields
     */
    private String studentName;
    private int programming;
    private int chasa;
    private int logic;
    private int is;
    private int foc;

    /**
     *
     * @param studentName
     * @param programming
     * @param chasa
     * @param logic
     * @param is
     * @param foc
     */
    public GradeInfo(String studentName, int programming, int chasa, int logic, int is, int foc) {
        this.studentName = studentName;
        this.programming = programming;
        this.chasa = chasa;
        this.logic = logic;
        this.is = is;
        this.foc = foc;
    }

    /**
     *
     * @return
     */
    public String getStudentName() {
        return studentName;
    }

    public int getProgramming() {
        return programming;
    }

    public int getChasa() {
        return chasa;
    }

    public int getLogic() {
        return logic;
    }

    public int getIs() {
        return is;
    }

    public int getFoc() {
        return foc;
    }

    public float gradeCalculate() {
        float result = (programming + chasa + logic + is + foc) / 5.0f;
        return result;
    }
}

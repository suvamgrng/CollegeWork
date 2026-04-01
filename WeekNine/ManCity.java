package WeekNine;


/**
 * Write a description of class MainCity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ManCity {
    private String coachName;
    private int goalDifference;
    
    public String getCoachName() {
        return coachName;
    }
    
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
    
    public int getGoalDifference() {
        return goalDifference;
    }
    
    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public static void main(String[] args) {
        System.out.println('\u000C');
        ManCity mc = new ManCity();
        mc.setCoachName("Suvam Gurung");
        mc.setGoalDifference(90);
        System.out.println("Coach name: " + mc.getCoachName());
        System.out.println("Goal DIfference: "+ mc.getGoalDifference());
    }
}
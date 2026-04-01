package WeekSeventin;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class CollegeViewer extends JFrame {

    public CollegeViewer(CollegeInfo info) {
        super("My College Window");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.CYAN);
        getContentPane().setForeground(Color.RED);

        JLabel label = new JLabel(info.toHTML(), SwingConstants.CENTER);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()-> {
            CollegeInfo college1 = new CollegeInfo("Informatics", "Pokhara", "BIT", "LondonMet", 500);
            CollegeInfo college2 = new CollegeInfo("Junior Citizens' Academy", "Budibazar", "Science", "Nepal", 700);

            CollegeViewer viewer1 = new CollegeViewer(college1);
            CollegeViewer viewer2  = new CollegeViewer(college2);
        });
    }
}

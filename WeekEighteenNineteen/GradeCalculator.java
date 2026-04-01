package WeekEighteenNineteen;

import javax.swing.*;
import java.awt.*;

public class GradeCalculator extends JFrame {
    private JTextField nameField;
    private JTextField programmingField;

    /**
     *
     * @param info
     */
    public GradeCalculator(GradeInfo info) {
        super("Grade Calculator");
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(7, 2, 8, 8));

        // Student name
        add(new JLabel("Name"));
        add(new JTextField(info.getStudentName()));

        // Programming marks
        add(new JLabel("Programming"));
        add(new JTextField(String.valueOf(info.getProgramming())));

        // CHASA marks
        add(new JLabel("CHASA"));
        add(new JTextField(String.valueOf(info.getChasa())));

        //Logic
        add(new JLabel("Logic"));
        add(new JTextField(String.valueOf(info.getLogic())));

        //IS
        add(new JLabel("IS"));
        add(new JTextField(String.valueOf(info.getIs())));

        //FOC
        add(new JLabel("FOC"));
        add(new JTextField(String.valueOf(info.getFoc())));

        // Button
        JButton btn = new JButton("Compute grade and Save");
        add(btn);  // add to grid

        JTextArea results = new JTextArea();
        add(results);

        btn.addActionListener(e -> {
            float grade = info.gradeCalculate();
            results.append(info.getStudentName() + ": " + grade + "\n");
        });


    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()-> {
            GradeInfo info = new GradeInfo("Sushil Parajuli", 99, 9, 99, 99, 99);
            GradeCalculator cal = new GradeCalculator(info);
            cal.setVisible(true);
        });
    }
}

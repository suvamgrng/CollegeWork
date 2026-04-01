package WeekEighteenNineteenClaude;

import javax.swing.*;
import java.awt.*;

public class Grade extends JFrame {

    public Grade() {
        super("Grade Calculator");
        setSize(800,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 10, 10));

        //Name of a student
        JLabel label1 = new JLabel("    Name");
        JTextField field1 = new JTextField(20);
        panel.add(label1);
        panel.add(field1);

        // Programming
        JLabel label2 = new JLabel("    Programming");
        JTextField field2 = new JTextField(7);
        panel.add(label2);
        panel.add(field2);

        //CHASA
        JLabel label3 = new JLabel("    CHASA");
        JTextField field3 = new JTextField(7);
        panel.add(label3);
        panel.add(field3);

        //Logic
        JLabel label4 = new JLabel("    Logic");
        JTextField field4 = new JTextField(7);
        panel.add(label4);
        panel.add(field4);

        //IS
        JLabel label5 = new JLabel("    IS");
        JTextField field5 = new JTextField(7);
        panel.add(label5);
        panel.add(field5);

        //FOC
        JLabel label6 = new JLabel("    FOC");
        JTextField field6 = new JTextField(7);
        panel.add(label6);
        panel.add(field6);

        //Button
        JButton btn = new JButton("Compute grade and Save");
        panel.add(new JLabel(""));
        panel.add(btn);

        // Setting/Wrapping panel inside JFrame
        add(panel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Grade grade = new Grade();
            grade.setVisible(true);
        });
    }
}

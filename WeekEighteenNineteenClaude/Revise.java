package WeekEighteenNineteenClaude;

import javax.swing.*;
import java.awt.*;

public class Revise extends JFrame {
    public Revise() {
        super("My App");
        setSize(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel label1 = new JLabel("Enter your name");
        JTextField field1 = new JTextField(20);
        panel.add(label1);
        panel.add(field1);

        JLabel label = new JLabel("Selection course");
        String[] course = {"BIT", "CSIT", "BBA"};
        JComboBox<String> box = new JComboBox<>(course);
        panel.add(label);
        panel.add(box);

        JPanel genderPanel = new JPanel();
        JLabel label2 = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        panel.add(label2);
        genderPanel.add(male);
        genderPanel.add(female);
        panel.add(genderPanel);
        JLabel label3 = new JLabel("");
        JButton btn = new JButton("Submit");
        panel.add(label3);
        panel.add(btn);

        add(panel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Revise revise = new Revise();
            revise.setVisible(true);
        });
    }
}

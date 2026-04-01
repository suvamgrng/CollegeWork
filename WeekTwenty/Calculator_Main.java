package WeekTwenty;

import javax.swing.*;
import java.awt.*;

public class Calculator_Main extends JFrame {
    JPanel northPanel, centerPanel, southPanel;
    JLabel lbTitle, lbFirstNumber, lbSecondNumber, lbResult;
    JTextField tfFirstNumber, tfSecondNumber;
    JButton addBtn, subBtn, intoBtn, divBtn;

    public Calculator_Main() {
        super("Full-Featured Calculator");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        northPanel = new JPanel();
        lbTitle = new JLabel("Calculator");
        northPanel.add(lbTitle);

        lbFirstNumber = new JLabel("Enter First");
        tfFirstNumber = new JTextField(8);

        lbSecondNumber = new JLabel("Enter second");
        tfSecondNumber = new JTextField(8);

        centerPanel.add(lbTitle, lbFirstNumber);
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator_Main::new);
    }
}

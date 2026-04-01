package WeekTwentyClaude;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {
    public Task2() {
        super("First Event Handler");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JButton btn = new JButton("Click me");
        panel.add(btn);
        add(panel);

        JLabel label = new JLabel("Click 0", SwingUtilities.CENTER);
        add(label);

        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        int[] counter = {0};
        btn.addActionListener(e -> {
            counter[0]++;

            label.setText("Click: " + counter[0] );
        });

        setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Task2:: new);
    }
}
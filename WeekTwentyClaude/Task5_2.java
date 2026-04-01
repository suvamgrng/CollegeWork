package WeekTwentyClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Task5_2 extends JFrame {
    public Task5_2() {
        super("Fifth_Two Task");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel centerPanel = new JPanel((new FlowLayout()));
        JPanel bottom = new JPanel(new FlowLayout());

        JLabel northLabel = new JLabel("Toggle Button");
        northPanel.add(northLabel);

        JLabel centerLabel = new JLabel("Status: OFF");
        centerPanel.add(centerLabel);
        JButton btn = new JButton("OFF");
        bottom.add(btn);

        boolean[] isOn = {false};

        ActionListener handler = e -> {
            isOn[0] = !isOn[0];

            if (isOn[0]) {
                centerLabel.setText("Status: ON");
                btn.setText("ON");
            } else {
                centerLabel.setText("Status: OFF");
                btn.setText("OFF");
            }
            System.out.println(isOn[0]);

        };
        btn.addActionListener(handler);
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(bottom, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task5_2::new);
    }
}

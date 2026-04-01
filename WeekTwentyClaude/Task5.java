package WeekTwentyClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Task5 extends JFrame {
    public Task5() {
        super("Fifth Task");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(8, 8));
        JPanel topRow = new JPanel(new FlowLayout());
        JPanel bottom = new JPanel(new FlowLayout());

        JLabel countLabel = new JLabel("Value: 0");
        JButton addBtn = new JButton("ADD");
        JButton subBtn = new JButton("SUBTRACT");

        // --- NEW: Setting reliable sizes without breaking the Layout Manager ---
        Dimension btnSize = new Dimension(120, 40);
        addBtn.setPreferredSize(btnSize);
        subBtn.setPreferredSize(btnSize);
        // -----------------------------------------------------------------------

        topRow.add(countLabel);
        bottom.add(addBtn);
        bottom.add(subBtn);

        panel.add(topRow, BorderLayout.CENTER);
        panel.add(bottom, BorderLayout.SOUTH);

        int[] value = {0};

        ActionListener handler = e -> {
            if (e.getActionCommand().equals("ADD")) {
                value[0]++;
            } else {
                value[0]--;
            }
            countLabel.setText("Value: " + value[0]);
        };

        addBtn.addActionListener(handler);
        subBtn.addActionListener(handler);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task5::new);
    }
}

package WeekTwentyClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class Task3 extends JFrame {
    public Task3() {
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        JCheckBox checkBox = new JCheckBox("Dark mode");
        panel.add(checkBox);
        add(panel);

        checkBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(Color.RED);
            } else {
                panel.setBackground(Color.WHITE);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task3::new);
    }
}


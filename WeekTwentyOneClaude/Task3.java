package WeekTwentyOneClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Task3 extends JFrame {
    private JPanel panel;
    private JLabel barLabel;

    public Task3() {
        super("Task Three");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        barLabel = new JLabel();
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // e.getX() and e.getY() get the exact pixel location
                barLabel.setText("Mouse at: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // This triggers if you click and move at the same time
                panel.setBackground(Color.LIGHT_GRAY);
            }
        });
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task3::new);
    }
}

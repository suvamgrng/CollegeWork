package WeekTwentyOneClaude;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Task extends JFrame {
    public Task() {
        super("Task");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Coordinates: ----");
        panel.add(label);

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                label.setText("Coordinates: (" + x + "," + y + ")");
                System.out.println("Coordinates: (" + x + "," + y + ")");
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                label.setText("Coordinates: (" + x + "," + y + ")");
                System.out.println("Coordinates: (" + x + "," + y + ")");
            }
        });
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task::new);
    }
}

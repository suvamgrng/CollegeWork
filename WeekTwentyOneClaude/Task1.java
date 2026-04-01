package WeekTwentyOneClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task1 extends JFrame {
    private final JPanel panel;
    private JLabel label;

    public Task1() {
        super("Task");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        label = new JLabel("Click window and including me");
        label.setOpaque(true);

        MouseAdapter handler = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Clicked at X=" + x + ", Y=" + y);
                label.setBackground(Color.BLUE);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.CYAN);
                System.out.println("Mouse entered the panel");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse left the panel");
                label.setBackground(Color.YELLOW);
            }
        };

        panel.addMouseListener(handler);
        label.addMouseListener(handler); // fix Bug 2
        panel.add(label);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task1::new);
    }
}
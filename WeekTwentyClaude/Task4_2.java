package WeekTwentyClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Task4_2 extends JFrame {
    public Task4_2() {
        super("Fourth_Two Task");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(8,8));
        JPanel topRow = new JPanel(new FlowLayout());
        JPanel bottom = new JPanel(new FlowLayout());

        JLabel enterLabel = new JLabel("Enter");
        JTextField field = new JTextField(20);
        JLabel releasedLabel = new JLabel("Released: X");

        topRow.add(enterLabel);
        topRow.add(field);
        bottom.add(releasedLabel);

        panel.add(topRow, BorderLayout.CENTER);
        panel.add(bottom, BorderLayout.SOUTH);

        field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                enterLabel.setText("Holding........");
            }

            @Override
            public void keyReleased(KeyEvent e) {

                releasedLabel.setText("Released: " + e.getKeyChar());
            }
        });
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task4_2::new);
    }
}

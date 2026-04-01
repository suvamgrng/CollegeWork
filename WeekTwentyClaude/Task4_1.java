package WeekTwentyClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Task4_1 extends JFrame {
    public Task4_1() {
            super("Fourth_One task");
            setSize(400,300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout(8,8));

            JPanel topRow = new JPanel();
            JPanel bottom = new JPanel();
            JTextField idField = new JTextField(20);
            JLabel label = new JLabel("Enter");
            JLabel label1 = new JLabel("");
            JLabel labelTyped = new JLabel("Characters Typed: 0");
            topRow.add(label);
            topRow.add(idField);
            topRow.add(label1);
            bottom.add(labelTyped);
            panel.add(topRow);
            panel.add(bottom);

            panel.add(topRow, BorderLayout.CENTER);
            panel.add(bottom, BorderLayout.SOUTH);
            add(panel);

            int[] count = {0};
            idField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    count[0]++;
                    System.out.println("Type: " + e.getKeyChar());
                    labelTyped.setText("Characters typed: " + count[0]);

                }
            });
            setVisible(true);
        }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(Task4_1::new);
    }
}

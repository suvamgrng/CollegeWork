package BroCode;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Main {
    public Main() {
        ImageIcon originalImage = new ImageIcon(Main.class.getResource("thumb.png"));   // 1. Load the original ImageIcon

        Image scaledImage = originalImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);    // 2. Scale it down to 100x100 pixels.

        ImageIcon image = new ImageIcon(scaledImage); // 3. Wrap the scaled image back to into an ImageIcon.


        JLabel label3 = new JLabel();
        label3.setText("Hi");
        label3.setIcon(image);
        label3.setHorizontalAlignment(JLabel.RIGHT);
        label3.setVerticalAlignment(JLabel.BOTTOM);
        label3.setBounds(100,100,100,75);
        // Red colour Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);
        // Blue colour Panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);
        // Green colour Panel
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setTitle("Hey what's up everybody?");
        frame.setLayout(null);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.add(redPanel);
        greenPanel.add(label3);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
package WeekSeventin;
import javax.swing.*;
import java.awt.*;

public class FirstWindow {
    public static void main(String[] args) {
        // Step 1: Create the frame
        JFrame frame = new JFrame();
        frame.setTitle("Hello World"); // Set the window name.
        // Step 2: Set the size (Width, Height)
        frame.setSize(400, 300);
        // Step 3: Set the close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //Set the window in middle of the screen.
        // Step 4: Make it visible
        frame.getContentPane().setBackground(new Color(200, 10, 40));

        JLabel label = new JLabel("Welcome to ICP");
        frame.add(label);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.setVisible(true);

    }
}
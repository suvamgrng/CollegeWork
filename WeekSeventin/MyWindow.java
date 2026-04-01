package WeekSeventin;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class MyWindow extends JFrame {
    public MyWindow() {
        super("Professional Window");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // 1. Create the JLabel object
        JLabel label = new JLabel("Welcome to GUI Programming!!");
        add(label);
    }
    public static void main(String[] args) {
        // Schedules the GUI creation to run safely on the EDT
        SwingUtilities.invokeLater(() -> {
            MyWindow window = new MyWindow();
            window.setVisible(true);
        });
    }
}

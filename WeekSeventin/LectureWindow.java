package WeekSeventin;
import javax.swing.*;
import java.awt.*;

public class LectureWindow extends JFrame{

    public LectureWindow() {
        super("MY First App");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JLabel label = new JLabel("Hello, Nepal!");
        add(label);

        // Step 1 - load your image file
        Image icon = new ImageIcon("WeekSeventin/amazon_logo.png").getImage();

// Step 2 - set it on the frame
        Taskbar.getTaskbar().setIconImage(icon);
    }
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
           LectureWindow window = new LectureWindow();
           window.setVisible(true);
       });
    }

    public static class CollegeViewer {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() ->{
                JFrame frame = new JFrame();
                frame.setTitle("College Viewer");
                frame.setSize(800, 300);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.getContentPane().setBackground(Color.cyan);
                frame.setResizable(false);

                String toHTML = "<html><div style='text-align:center'>" +
                        "<h2>College name: Informatic College Pokhara</h2>" +
                        "<p'>Location: Ranipawa</p>" +
                        "<p>Programme: BIT</p>" +
                        "</div></html>";

                JLabel label = new JLabel(toHTML, SwingConstants.CENTER);
                frame.add(label);

                frame.setVisible(true);
            });

        }
    }
}

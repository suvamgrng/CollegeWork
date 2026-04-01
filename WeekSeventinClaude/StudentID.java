package WeekSeventinClaude;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;


public class StudentID extends JFrame {

    public StudentID(ClaudeInfo info) {
        super("Student ID Card");
        setSize(400, 300);
        getContentPane().setBackground(Color.DARK_GRAY);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel(getHTML(info), SwingConstants.CENTER);
        add(label);
    }
    String getHTML(ClaudeInfo info) {
        return "<html><div style='text-align:center'>" +
                "<p>Name: " + info.getName() + "</p>" +
                "<p>Course: " + info.getCourse() + "</p>" +
                "<p>StudentID: " + info.getStudentID() + "</p>" +
                "<p><small>Valid Date: " + info.getIssueDate() + "</small></p>" +
                "<p><small>Expiry Date: " + info.getExpiryDate() + "</small></p>" +
                "</div></html>";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClaudeInfo info = new ClaudeInfo("Suvam Gurung", "BIT", 12345);
            System.out.println("Initial date: " +info.getIssueDate());
            System.out.println("Expiry date: " + info.getExpiryDate());
            StudentID id = new StudentID(info);
            id.setVisible(true);
        });
    }
}

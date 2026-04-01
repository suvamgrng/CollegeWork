package WeekSeventin;

/** Create an IDCardWindow class that extends JFrame and configures itself as a
 card-sized window. **/

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;

public class IDCardWindow extends JFrame {

    public IDCardWindow(Student std) {
        super(std.getStudentName() + " — ID Card");
        setSize(450, 320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(245, 248, 255));

        JLabel card = new JLabel(std.toHTML(), SwingConstants.CENTER);
        add(card);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()-> {
            Student std1 = new Student(
                    "Suvam Gurung",
                    "12423",
                    "BIT",
                    1,
                    "Informatics");
            Student std2 = new Student(
                    "Ram Bahadur Thapa",
                    "LMSC-2025-002",
                    "BSc IT",
                    2,
                    "LondonMet School of Computing");

            Student std3 = new Student("Sita Kumari Rai",
                    "LMSB-2025-003",
                    "BA Business",
                    1,
                    "LondonMet School of Business");
            IDCardWindow window1 = new IDCardWindow(std1);
            IDCardWindow window2 = new IDCardWindow(std2);
            IDCardWindow window3 = new IDCardWindow(std3);

            window1.setVisible(true);
            window2.setVisible(true);
            window3.setVisible(true);
        });

    }
}

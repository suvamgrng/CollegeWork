package WeekTwentyOneClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TutorialOne extends JFrame {
    JLabel label;

    public TutorialOne() {
        super("Task");
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel();

        label.setBounds(0,0,100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);


        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                int button = e.getButton();
                int count = e.getClickCount();
                System.out.println("Mouse clicked at label");
                System.out.println(x + "," + y);
                System.out.println("Clicked count: " + count);
                System.out.println("Button" + button);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the label");
                label.setBackground(Color.BLUE);
                getContentPane().setBackground(Color.PINK);

            }
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("The mouse was pressed");
                label.setBackground(Color.RED);
                getContentPane().setBackground(Color.lightGray);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("The mouse was released");
                label.setBackground(Color.BLACK);
                getContentPane().setBackground(Color.BLUE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("The mouse was exited");
                label.setBackground(Color.yellow);
                getContentPane().setBackground(Color.RED);
            }
        });
        add(label);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TutorialOne::new);
    }
}

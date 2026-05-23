package BroCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static javax.swing.BorderFactory.createLineBorder;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public MyFrame() {

        ImageIcon originalIcon1 = new ImageIcon(Objects.requireNonNull(MyFrame.class.getResource("Smile.jpeg")));
        Image scaledIcon1 = originalIcon1.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(scaledIcon1);

        ImageIcon originalIcon2 = new ImageIcon(Objects.requireNonNull(Main.class.getResource("click.jpg")));
        Image scaledIcon2 = originalIcon2.getImage().getScaledInstance(65,60,Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(scaledIcon2);

        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-6);
        button.setForeground(Color.GREEN);
        button.setBackground(Color.blue);
        button.setBorder(createLineBorder(Color.BLACK, 2));
        button.setOpaque(true);
        button.setText("Im a button");
        button.setFont(new Font("Mv Boli", Font.BOLD, 20));
        button.setIcon(icon2);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        this.add(button);
        this.add(label);
        this.setVisible(true);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Poo");
            label.setVisible(true);
        }
        setEnabled(false);
    }
}

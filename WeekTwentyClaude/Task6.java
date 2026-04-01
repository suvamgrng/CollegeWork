package WeekTwentyClaude;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Task6 extends JFrame {
    public Task6() {
        super("Sixth Task");
        setSize(800, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panels
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        JPanel gridPanel = new JPanel(new GridLayout(3, 2, 8, 8));
        JPanel northPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());
        JPanel southPanel = new JPanel(new FlowLayout());

        // Navigation bar
        JLabel barLabel = new JLabel("Calculator");
        northPanel.add(barLabel);

        // Number inputs
        JLabel inputFirst = new JLabel("Enter first number");
        JTextField numberFirst = new JTextField(8);

        JLabel inputSecond = new JLabel("Enter second number");
        JTextField numberSecond = new JTextField(8);

        // Result display
        JLabel resultLabel = new JLabel("Result: 0");

        gridPanel.add(inputFirst);
        gridPanel.add(numberFirst);
        gridPanel.add(inputSecond);
        gridPanel.add(numberSecond);
        gridPanel.add(resultLabel);
        centerPanel.add(gridPanel);

        // Buttons
        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton multiBtn = new JButton("x");
        JButton divideBtn = new JButton("÷");

        southPanel.add(addBtn);
        southPanel.add(subBtn);
        southPanel.add(multiBtn);
        southPanel.add(divideBtn);

        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(southPanel, BorderLayout.SOUTH);
        add(panel);

        // Mouse hover effect — reuse for all 4 buttons
        MouseListener hoverEffect = new MouseListener() {
            public void mouseEntered(MouseEvent e) {
                // Cast getSource() back to JButton so we can change its color
                JButton btn = (JButton) e.getSource();
                btn.setBackground(Color.RED);
            }
            public void mouseExited(MouseEvent e) {
                JButton btn = (JButton) e.getSource();
                btn.setBackground(null); // reset to default
            }
            public void mouseClicked(MouseEvent e)  { }
            public void mousePressed(MouseEvent e)  { }
            public void mouseReleased(MouseEvent e) { }
        };
        // Make buttons respond to OS painting so setBackground works
        addBtn.setOpaque(true);
        subBtn.setOpaque(true);
        multiBtn.setOpaque(true);
        divideBtn.setOpaque(true);

        addBtn.addMouseListener(hoverEffect);
        subBtn.addMouseListener(hoverEffect);
        multiBtn.addMouseListener(hoverEffect);
        divideBtn.addMouseListener(hoverEffect);

        // ✅ try/catch is now INSIDE the lambda — runs on every button click
        ActionListener handler = e -> {
            try {
                double num_1 = Double.parseDouble(numberFirst.getText());
                double num_2 = Double.parseDouble(numberSecond.getText());
                double result = 0;

                switch (e.getActionCommand()) {
                    case "+": result = num_1 + num_2; break;
                    case "-": result = num_1 - num_2; break;
                    case "x": result = num_1 * num_2; break;
                    case "÷":
                        if (num_2 == 0) {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        result = num_1 / num_2;
                        break;
                }
                resultLabel.setText("Result: " + result);

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(null, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        };

        addBtn.addActionListener(handler);
        subBtn.addActionListener(handler);
        multiBtn.addActionListener(handler);
        divideBtn.addActionListener(handler);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task6::new);
    }
}
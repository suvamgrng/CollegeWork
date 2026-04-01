package WeekTwenty;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    private double storedValue = 0;
    private String operator = "";
    private boolean freshInput = true;

    private JFrame frame;
    private JTextField display;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 500);
        frame.setLayout(new BorderLayout());

        //Visible number starting with 0 at top of the window
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("SansSerif", Font.BOLD, 40));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 14));
        frame.add(display, BorderLayout.NORTH);

        // Button Panel setup
        JPanel panel = new JPanel(new GridBagLayout()); // GridBagLayout is used (instead of GridLayout) because the 0 button needs to span 2 columns.
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        GridBagConstraints g = new GridBagConstraints();
        g.fill = GridBagConstraints.BOTH; // buttons stretch to fill their cell
        g.insets = new Insets(4, 4, 4, 4); // 4px gap between every button
        g.weightx = 1; g.weighty = 1; // all columns/rows share space equally

        // Button Grid (rows array)
        String[][] rows = {

                {"7", "8",   "9", "*"},
                {"4", "5",   "6", "-"},
                {"1", "2",   "3", "+"}
        };

        //  gridx = column, gridy = row.
        for (int row = 0; row < rows.length; row++) {
            for (int col = 0; col < rows[row].length; col++) {
                g.gridx = col;  // column position
                g.gridy = row;  // row position
                g.gridwidth = 1;
                panel.add(makeBtn(rows[row][col]), g);
            }
        }

        //  gridx = column
        // Last row: 0 (wide), ., =
        g.gridx = 0; g.gridy = 4; g.gridwidth = 2; panel.add(makeBtn("0"), g);
        g.gridx = 2; g.gridy = 4; g.gridwidth = 1; panel.add(makeBtn("."), g);
        g.gridx = 3; g.gridy = 4; g.gridwidth = 1; panel.add(makeBtn("="), g);

        frame.add(panel, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private JButton makeBtn(String label) {
        String show = label.equals("/") ? "÷" : label.equals("*") ? "×" : label;
        JButton b = new JButton(show);
        b.setFont(new Font("SansSerif", Font.PLAIN, 20));
        b.setActionCommand(label);
        b.addActionListener(this);
        b.setFocusPainted(false);
        return b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.matches("[0-9]") || cmd.equals(".")) {
            if (freshInput) { display.setText(cmd.equals(".") ? "0." : cmd); freshInput = false; }
            else {
                String cur = display.getText();
                if (cmd.equals(".") && cur.contains(".")) return;
                display.setText(cur.equals("0") && !cmd.equals(".") ? cmd : cur + cmd);
            }
        } else if (cmd.equals("C")) {
            display.setText("0"); storedValue = 0; operator = ""; freshInput = true;
        } else if (cmd.equals("=")) {
            if (operator.isEmpty() || display.getText().equals("Error")) return;
            double input = Double.parseDouble(display.getText()), result = 0;
            switch (operator) {
                case "+": result = storedValue + input; break;
                case "-": result = storedValue - input; break;
                case "*": result = storedValue * input; break;
                case "/":
                    if (input == 0) { display.setText("Error"); operator = ""; freshInput = true; return; }
                    result = storedValue / input; break;
            }
            display.setText(result == (long) result ? String.valueOf((long) result) : String.valueOf(result));
            operator = ""; freshInput = true;
        } else if ("+-*/".contains(cmd)) {
            if (display.getText().equals("Error")) return;
            storedValue = Double.parseDouble(display.getText());
            operator = cmd; freshInput = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()-> {
            Calculator calculator = new Calculator();
        });
    }
    }
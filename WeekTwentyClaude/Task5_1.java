package WeekTwentyClaude;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/** Task A — Simple calculator**

 Create two `JTextField`s for numbers and three buttons: `"Add"`, `"Subtract"`, `"Multiply"`.
 Use ONE `ActionListener` for all three. Show the result in a `JLabel`.
 ```
 Goal: practice getActionCommand() with 3+ buttons
 Hint: result = Integer.parseInt(field1.getText()) **/

public class Task5_1 extends JFrame {
    public Task5_1() {
        super("Five_One Task");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panels
        JPanel panel = new JPanel(new BorderLayout(8,30));
        JPanel middle = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel topRow = new JPanel(new GridLayout(2,2));
        JPanel centerRow = new JPanel(new FlowLayout());
        JPanel bottom = new JPanel(new FlowLayout());

        // Input fields
        JLabel firstLabel = new JLabel("Enter");
        JTextField firstField = new JTextField(8);

        JLabel secondLabel = new JLabel("Enter");
        JTextField secondField = new JTextField(8);

        topRow.add(firstLabel);
        topRow.add(firstField);
        topRow.add(secondLabel);
        topRow.add(secondField);
        middle.add(topRow);

        // --- Result label ---
        JLabel resultLabel = new JLabel("Result:");
        centerRow.add(resultLabel);

        // Buttons
        JButton addBtn = new JButton("ADD");
        JButton subBtn = new JButton("SUBTRACT");
        JButton multiBtn = new JButton("MULTIPLY");

        bottom.add(addBtn);
        bottom.add(subBtn);
        bottom.add(multiBtn);

        ActionListener handler = e -> {
            int num1 = Integer.parseInt(firstField.getText());
            int num2 = Integer.parseInt(secondField.getText());
            int result = 0;

            switch(e.getActionCommand()) {
                case "ADD" -> result = num1 + num2;
                case "SUBTRACT" -> result = num1 - num2;
                case "MULTIPLY" -> result = num1 * num2;
            }
            resultLabel.setText("Result: " + result);
        };
        addBtn.addActionListener(handler);
        subBtn.addActionListener(handler);
        multiBtn.addActionListener(handler);

        panel.add(middle, BorderLayout.NORTH);
        panel.add(centerRow, BorderLayout.CENTER);
        panel.add(bottom, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task5_1::new);
    }
}

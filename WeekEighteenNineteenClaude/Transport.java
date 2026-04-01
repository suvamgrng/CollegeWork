package WeekEighteenNineteenClaude;

import javax.swing.*;
import java.awt.*;

public class Transport extends JFrame {
    public Transport() {
        super("Bus pvt.ld");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        JLabel label = new JLabel("Transport: ");
        JCheckBox bus = new JCheckBox("Bus");
        JCheckBox bike = new JCheckBox("Bike");
        JCheckBox car = new JCheckBox("Car");
        panel.add(label);
        panel.add(bus);
        panel.add(bike);
        panel.add(car);
        add(panel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {
            Transport transport = new Transport();
            transport.setVisible(true);
        });
    }
}

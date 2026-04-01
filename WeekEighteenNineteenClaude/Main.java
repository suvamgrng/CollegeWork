package WeekEighteenNineteenClaude;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Main extends JFrame {
    public Main() {
        super("My App");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);


        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 2, 10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 10));
        JPanel southPanel = new JPanel();
        // Create North Panel

        northPanel.add(new JLabel("Student Registration"));

        JLabel label1 = new JLabel("Name");
        JTextField field1 = new JTextField(10);
        centerPanel.add(label1);
        centerPanel.add(field1);

        JLabel label2 = new JLabel("Course");
        String[] course = {"BIT", "BBA", "CSIT"};
        JComboBox<String> box = new JComboBox<>(course);
        centerPanel.add(label2);
        centerPanel.add(box);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label3 = new JLabel("Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        centerPanel.add(label3);
        genderPanel.add(male);
        genderPanel.add(female);
        centerPanel.add(genderPanel);

        JLabel label4 = new JLabel("Transport");
        JPanel transportPanel = new JPanel();
        JCheckBox bus = new JCheckBox("Bus");
        JCheckBox bike = new JCheckBox("Bike");
        JCheckBox car = new JCheckBox("Car");

        transportPanel.add(bus);
        transportPanel.add(bike);
        transportPanel.add(car);

        centerPanel.add(label4);
        centerPanel.add(transportPanel);

        JButton btn = new JButton("Submit");
        southPanel.add(btn);

        JButton clearBtn = new JButton("Clear");
        southPanel.add(clearBtn);

        // 1. Column headers
        String[] columns = {"Name", "Course", "Gender"};

        // 2. Table Model — holds the data
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        //      0 = start empty

        // 3. JTable — displays the model
        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(
                new Dimension(300, 100)
        );
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(new JScrollPane(table), BorderLayout.EAST);
        add(southPanel, BorderLayout.SOUTH);

        btn.addActionListener(e -> {
                    // Step1: Ask user to confirm

                    String name = field1.getText().trim();

                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Name Required", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!male.isSelected() && !female.isSelected()) {
                        JOptionPane.showMessageDialog(null, "Select gender", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String selectedCourse = box.getSelectedItem().toString();
                    String gender = male.isSelected() ? "Male" : "Female";
                    model.addRow(new Object[]{name, selectedCourse, gender});
                    System.out.println("Transport:");
                    if (bus.isSelected()) System.out.println("- Bus");
                    if (bike.isSelected()) System.out.println("- Bike");
                    if (car.isSelected()) System.out.println("- Car");
                }
        );

        clearBtn.addActionListener(e -> {
            // --- RESET FORM HERE ---
            field1.setText("");           // Clear Name
            box.setSelectedIndex(0);      // Reset Course to first item
            group.clearSelection();       // Uncheck Male/Female
            bus.setSelected(false);       // Uncheck Bus
            bike.setSelected(false);      // Uncheck Bike
            car.setSelected(false);
        });



    }
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}
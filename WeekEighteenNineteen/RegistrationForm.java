package WeekEighteenNineteen;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {

   public RegistrationForm() {
      super("ICP");
      setSize(500, 650);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      JPanel root = new JPanel(new BorderLayout(8, 8));
      root.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
      JPanel formPanel = new JPanel(new GridLayout(5, 2, 8, 8));
      formPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(47, 87, 87)), "Student Details"));
      JPanel northPanel = new JPanel();
      JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

      //Fonts
      Font titleFont = new Font("SansSerif", Font.BOLD, 20);
      Font inputFont = new Font("SansSerif", Font.PLAIN, 13);

      JLabel titleLabel = new JLabel("RegistrationForm");
      titleLabel.setFont(titleFont);
      northPanel.add(titleLabel);
      root.add(northPanel, BorderLayout.NORTH);

      JLabel label1 = new JLabel("Student ID");
      JTextField idField = new JTextField(20);
      idField.setFont(inputFont);
      formPanel.add(label1);
      formPanel.add(idField);

      JLabel label2 = new JLabel("Name");
      JTextField nameField = new JTextField(20);
      formPanel.add(label2);
      nameField.setFont(inputFont);
      formPanel.add(nameField);

      String[] course = {"BIT", "BBA", "CSIT", "MBBS"};
      JLabel label3 = new JLabel("Course");
      JComboBox<String> box = new JComboBox<>(course);
      formPanel.add(label3);
      formPanel.add(box);

      JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JLabel label4 = new JLabel("Gender");
      JRadioButton male = new JRadioButton("Male");
      JRadioButton female = new JRadioButton("Female");
      JRadioButton others = new JRadioButton("Other");
      ButtonGroup group = new ButtonGroup();
      group.add(male);
      group.add(female);
      group.add(others);
      genderPanel.add(male);
      genderPanel.add(female);
      genderPanel.add(others);
      formPanel.add(label4);
      formPanel.add(genderPanel);

      JPanel tickPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JLabel label5 = new JLabel("Service:");
      JCheckBox bus = new JCheckBox("Bus");
      JCheckBox taxi = new JCheckBox("Taxi");
      JCheckBox car = new JCheckBox("Car");
      JCheckBox internet = new JCheckBox("Internet");
      tickPanel.add(bus);
      tickPanel.add(taxi);
      tickPanel.add(car);
      tickPanel.add(internet);
      formPanel.add(label5);
      formPanel.add(tickPanel);

      JPanel formWrapper = new JPanel(new BorderLayout());
      formWrapper.add(formPanel, BorderLayout.NORTH);
      root.add(formWrapper, BorderLayout.CENTER);

      JButton saveBtn = new JButton("Submit");
      saveBtn.setBackground(new Color(0, 128, 128));
      saveBtn.setForeground(Color.WHITE);
      saveBtn.setOpaque(true);           //  forces the button to fill its background
      saveBtn.setBorderPainted(false);   //  removes the native Mac border that overrides color
      southPanel.add(saveBtn);

      JButton clearBtn = new JButton("Clear");
      clearBtn.setBackground(new Color(0, 128, 128));
      clearBtn.setForeground(Color.WHITE);
      clearBtn.setOpaque(true);
      clearBtn.setBorderPainted(false);
      southPanel.add(clearBtn);

      JTextArea detailsArea = new JTextArea(8, 28);
      detailsArea.setEditable(false);
      detailsArea.setLineWrap(true);
      detailsArea.setWrapStyleWord(true);

      JScrollPane detailsScroll = new JScrollPane(detailsArea);
      JLabel statusLabel = new JLabel(" ");

      JPanel bottomPanel = new JPanel(new BorderLayout(4, 4));
      bottomPanel.add(statusLabel, BorderLayout.NORTH);
      bottomPanel.add(detailsScroll, BorderLayout.CENTER);
      bottomPanel.add(southPanel, BorderLayout.SOUTH);


      root.add(bottomPanel, BorderLayout.SOUTH);
      add(root);


      saveBtn.addActionListener(e -> {
         String name = nameField.getText();
         String studentID = idField.getText();

         if (name.isEmpty() || studentID.isEmpty()) {
            statusLabel.setText("Please fill ID and Name");
            statusLabel.setForeground(Color.red);
            return;
         }
         if (!male.isSelected() && !female.isSelected() && !others.isSelected()) {
            statusLabel.setText("Please select gender");
            statusLabel.setForeground(Color.RED);
            return;
         }
         String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Others";

         String services = "";
         if (bus.isSelected()) services += "Bus ";
         if (taxi.isSelected()) services += "Taxi ";
         if (car.isSelected()) services += "Car ";
         if (internet.isSelected()) services += "Internet ";

         if (services.isEmpty()) services = "None";

         // Build the details text using StringBuilder
         StringBuilder sb = new StringBuilder();
         sb.append("Student ID : ").append(studentID).append("\n");
         sb.append("Name       : ").append(name).append("\n");
         sb.append("Course     : ").append(box.getSelectedItem()).append("\n");
         sb.append("Gender     : ").append(gender).append("\n");
         sb.append("Services   : ").append(services);

// Push to display area
         detailsArea.setText(sb.toString());

// Update status label
         statusLabel.setText("Submitted");
         statusLabel.setForeground(new Color(0, 128, 0)); // green

      });
      clearBtn.addActionListener(e -> {
         idField.setText("");
         nameField.setText("");
         group.clearSelection();
         box.setSelectedIndex(0);
         bus.setSelected(false);       // Uncheck Bus
         internet.setSelected(false);      // Uncheck internet
         car.setSelected(false);
         taxi.setSelected(false);

         StringBuilder sb = new StringBuilder();
         detailsArea.setText("");

         statusLabel.setText("Cleared");
         statusLabel.setForeground(Color.gray);
         idField.requestFocusInWindow(); // ✅ puts cursor back on ID field after clearing
      });
   }
    public static void main(String[] args) {
        RegistrationForm main = new RegistrationForm();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
}

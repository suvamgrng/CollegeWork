package WeekEighteenNineteen;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void createComponents()
    {
        JFrame frame = new JFrame("Demo");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel lblName = new JLabel("Name:");
        JLabel lblAge = new JLabel("Age:");
        JLabel lblGender = new JLabel("Gender:");
        JTextField txtName = new JTextField(15);
        JTextField txtAge = new JTextField(15);
        JComboBox cbGender = new JComboBox();
        cbGender.addItem("Male");
        cbGender.addItem("Female");

        JButton btnSave= new JButton("Save");
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblAge);
        frame.add(txtAge);
        frame.add(lblGender);
        frame.add(cbGender);
        frame.add(btnSave);
        btnSave.addActionListener(e->{
            String name = txtName.getText().trim();
            String age = txtAge.getText().trim();
            String gender = cbGender.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Name:"+name+"\n Age:"+age+"\n Gender:"+gender);
        });
        btnSave.setEnabled(false);
        frame.setVisible(true);

    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(Main::createComponents);

    }




}

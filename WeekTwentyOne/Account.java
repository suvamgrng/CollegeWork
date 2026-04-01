package WeekTwentyOne;


import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.HORIZONTAL;

public class Account extends JFrame {
    GridBagLayout gridBag;
    GridBagConstraints gbc;
    JLabel newAccount;

    public Account() {
        super("New Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        gbc = new GridBagConstraints();
        gridBag = new GridBagLayout();
        setLayout(gridBag);

        newAccount = new JLabel("New Account");

        //Add new account message label in first line
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        add(newAccount, gbc);

        //Add  Account No.
        JLabel lbAccount = new JLabel("Account No.");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(lbAccount, gbc);
        JTextField tfAccount = new JTextField(22);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(tfAccount, gbc);

        //Add Name on same row
        JLabel lbName = new JLabel("Name");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(lbName, gbc);
        JTextField tfName = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(tfName, gbc);

        //Add Bank Code no.
        JLabel lbBankCode = new JLabel("Bank Code No.");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(lbBankCode, gbc);

        JTextField tfBankCode = new JTextField(22);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(tfBankCode, gbc);

        // Add DOB
        JLabel lbDOB = new JLabel("Date of Birth");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(lbDOB, gbc);
        JTextField tfDOB = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(tfDOB, gbc);

        //Add Pin
        JLabel lbAdd = new JLabel("Pin");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(lbAdd, gbc);
        JTextField tfAdd = new JTextField(22);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(tfAdd, gbc);

        //Add Nationality
        JLabel lbNationality = new JLabel("Nationality");
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(lbNationality, gbc);

        String[] country = {"Select", "Nepal", "USA", "China"};
        JComboBox<String>  tfSelect = new JComboBox<>(country);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        tfSelect.setPreferredSize(new Dimension(200,20));
        add(tfSelect, gbc);

        // Add Account Type
        JLabel lbAccType = new JLabel("Account Type");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(lbAccType, gbc);

        String[] accType = {"Select", "Saving", "Current"};
        JComboBox<String> tfAccType = new JComboBox<>(accType);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        tfAccType.setPreferredSize(new Dimension(280,20));
        add(tfAccType, gbc);

        //Add Caste
        JLabel lbCaste = new JLabel("Caste");
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(lbCaste, gbc);

        JTextField tfCaste = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        add(tfCaste, gbc);

        // Add gender
        JLabel lbGender = new JLabel("Gender");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(lbGender, gbc);

        JRadioButton gender = new JRadioButton();

        //Set visible
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Account::new);
    }
}

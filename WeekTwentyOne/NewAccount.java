package WeekTwentyOne;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NewAccount {

    static List<String[]> accounts = new ArrayList<>();
    static int accountNo = 30828;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NewAccount::showForm);
    }

    static void showForm() {
        JDialog d = new JDialog((Frame) null, "New Account", true);
        d.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(4, 6, 4, 6);
        g.fill = GridBagConstraints.HORIZONTAL;

        JTextField tfName    = new JTextField(15);
        JTextField tfDob     = new JTextField(15);
        JTextField tfNat     = new JTextField(15);
        JTextField tfAccNo   = new JTextField(String.valueOf(accountNo));
        JTextField tfBank    = new JTextField("708");
        JTextField tfPin     = new JTextField("577");
        JTextField tfCaste   = new JTextField(15);
        JTextField tfMobile  = new JTextField(15);
        JTextField tfAddress = new JTextField(20);
        JTextField tfAnswer  = new JTextField(15);
        tfAccNo.setEditable(false);

        String[] types = {"Select","Savings","Current","Fixed Deposit"};
        String[] sqs   = {"Select","Pet's name?","Mother's maiden name?","City of birth?"};
        JComboBox<String> cbType = new JComboBox<>(types);
        JComboBox<String> cbSQ   = new JComboBox<>(sqs);

        JRadioButton rbM = new JRadioButton("Male");
        JRadioButton rbF = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbM); bg.add(rbF);
        JPanel gPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 4, 0));
        gPanel.add(rbM); gPanel.add(rbF);

        Object[][] rows = {
                {"Name", tfName,       "Date of Birth",  tfDob},
                {"Nationality", tfNat, "Account No.",    tfAccNo},
                {"Bank Code No.", tfBank, "Caste",       tfCaste},
                {"Pin", tfPin,         "Mobile",         tfMobile},
                {"Account Type", cbType, "Gender",       gPanel},
                {"Security Q", cbSQ,   "Answer",         tfAnswer},
        };

        int r = 0;
        for (Object[] row : rows) {
            g.gridy = r++;
            g.gridx = 0; g.weightx = 0; d.add(new JLabel((String)row[0]), g);
            g.gridx = 1; g.weightx = 1; d.add((Component)row[1], g);
            g.gridx = 2; g.weightx = 0; d.add(new JLabel((String)row[2]), g);
            g.gridx = 3; g.weightx = 1; d.add((Component)row[3], g);
        }

        g.gridy = r++; g.gridx = 0; g.weightx = 0; d.add(new JLabel("Address"), g);
        g.gridx = 1; g.gridwidth = 3; g.weightx = 1; d.add(tfAddress, g);
        g.gridwidth = 1;

        JButton btnCreate = new JButton("Create");
        JButton btnClear  = new JButton("Clear");
        JButton btnClose  = new JButton("Close");
        JPanel bp = new JPanel();
        bp.add(btnCreate); bp.add(btnClear); bp.add(btnClose);
        g.gridy = r; g.gridx = 0; g.gridwidth = 4;
        d.add(bp, g);

        btnCreate.addActionListener(e -> {
            if (tfName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(d, "Name is required.");
                return;
            }
            String gender = rbM.isSelected() ? "Male" : rbF.isSelected() ? "Female" : "Not Selected";
            String[] acc = {String.valueOf(accountNo++), tfBank.getText(), tfName.getText(),
                    tfDob.getText(), tfNat.getText(), tfCaste.getText(), tfMobile.getText(),
                    tfPin.getText(), cbType.getSelectedItem().toString(), gender,
                    tfAddress.getText(), cbSQ.getSelectedItem().toString(), tfAnswer.getText()};
            accounts.add(acc);
            showInfo(acc, d);
            tfAccNo.setText(String.valueOf(accountNo));
        });

        btnClear.addActionListener(e -> {
            for (JTextField f : new JTextField[]{tfName,tfDob,tfNat,tfCaste,tfMobile,tfAddress,tfAnswer})
                f.setText("");
            cbType.setSelectedIndex(0); cbSQ.setSelectedIndex(0); bg.clearSelection();
        });

        btnClose.addActionListener(e -> d.dispose());

        d.pack();
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }

    static void showInfo(String[] acc, JDialog parent) {
        JDialog info = new JDialog(parent, "Account Details", true);
        info.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(3, 8, 3, 8);
        g.anchor = GridBagConstraints.WEST;

        String[] labels = {"Account No.","Bank Code","Name","DOB","Nationality","Caste",
                "Mobile","Pin","Account Type","Gender","Address","Security Q","Answer"};
        for (int i = 0; i < labels.length; i++) {
            g.gridy = i;
            g.gridx = 0; info.add(new JLabel(labels[i] + ":"), g);
            g.gridx = 1; info.add(new JLabel(acc[i].isEmpty() ? "—" : acc[i]), g);
        }

        JButton ok = new JButton("OK");
        g.gridy = labels.length; g.gridx = 0; g.gridwidth = 2;
        g.anchor = GridBagConstraints.CENTER;
        info.add(ok, g);
        ok.addActionListener(e -> info.dispose());

        info.pack();
        info.setLocationRelativeTo(parent);
        info.setVisible(true);
    }
}


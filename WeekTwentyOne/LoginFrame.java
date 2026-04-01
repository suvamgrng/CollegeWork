package WeekTwentyOne;
import javax.swing.*;
import java.awt.*;

public class LoginFrame {
    void LoginFrame()
    {
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        GridBagLayout gridbag = new GridBagLayout();
        frame.setLayout(gridbag);
        JLabel lblIncorrectMessage = new JLabel("Incorrect Username or Password");
        GridBagConstraints gbc = new GridBagConstraints();

        //Add incorrect message label in first line
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(5,5,5,5);
        frame.add(lblIncorrectMessage,gbc);

        //Add username
        JLabel lblUsername = new JLabel("Username");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(lblUsername,gbc);
        JTextField tfusername = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(tfusername,gbc);

        //Add password
        JLabel lblPassword = new JLabel("Password");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        frame.add(lblPassword,gbc);
        JTextField tfpassword = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        frame.add(tfpassword,gbc);

        //Add login
        JButton btnLogin = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(btnLogin,gbc);

        //Add clear
        JButton btnClear = new JButton("Clear");
        gbc.gridx = 1;
        gbc.gridy = 4;
        frame.add(btnClear,gbc);

        //Add attempt label
        JLabel lblLogout = new JLabel("0 Attempts");
        gbc.gridx = 1;
        gbc.gridy = 5;
        frame.add(lblLogout,gbc);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.LoginFrame();
    }
}